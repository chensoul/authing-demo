/*
 * Copyright © 2025 Wesine, Inc. (admin@wesine.com.cn)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.chensoul.shared.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author <a href="mailto:ichensoul@gmail.com">chensoul</a>
 */
@Data
@Slf4j
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class AuditBasedWithExtra extends AuditBased implements HasExtra, HasId {

    @NotNull(message = "附加信息不能为空")
    protected transient JsonNode extra;

    @JsonIgnore
    @ToString.Exclude
    protected byte[] extraBytes;

    public AuditBasedWithExtra() {
        super();
    }

    public AuditBasedWithExtra(String id) {
        super(id);
    }

    public AuditBasedWithExtra(AuditBasedWithExtra baseData) {
        super(baseData);
        setExtra(baseData.getExtra());
    }

    public static JsonNode getJson(Supplier<JsonNode> jsonData, Supplier<byte[]> binaryData) {
        JsonNode json = jsonData.get();
        if (json != null) {
            return json;
        } else {
            byte[] data = binaryData.get();
            if (data != null) {
                try {
                    return mapper.readTree(new ByteArrayInputStream(data));
                } catch (IOException e) {
                    log.warn("Can't deserialize jackson data: ", e);
                    return null;
                }
            } else {
                return null;
            }
        }
    }

    public static void setJson(JsonNode json, Consumer<JsonNode> jsonConsumer, Consumer<byte[]> bytesConsumer) {
        jsonConsumer.accept(json);
        try {
            bytesConsumer.accept(mapper.writeValueAsBytes(json));
        } catch (JsonProcessingException e) {
            log.warn("Can't serialize jackson data: ", e);
        }
    }

    public void setExtraField(String field, JsonNode value) {
        JsonNode additionalInfo = getExtra();
        if (!(additionalInfo instanceof ObjectNode)) {
            additionalInfo = mapper.createObjectNode();
        }
        ((ObjectNode) additionalInfo).set(field, value);
        setExtra(additionalInfo);
    }

    public <T> T getExtraField(String field, Function<JsonNode, T> mapper, T defaultValue) {
        JsonNode additionalInfo = getExtra();
        if (additionalInfo != null && additionalInfo.has(field)) {
            return mapper.apply(additionalInfo.get(field));
        }
        return defaultValue;
    }

    @Override
    public JsonNode getExtra() {
        return getJson(() -> extra, () -> extraBytes);
    }

    public void setExtra(JsonNode extra) {
        setJson(extra, json -> this.extra = json, bytes -> this.extraBytes = bytes);
    }
}
