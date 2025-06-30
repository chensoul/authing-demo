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
package com.chensoul.authing.shared.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

import static com.chensoul.rose.core.util.date.DatePattern.NORM_DATETIME_PATTERN;

/**
 * @author <a href="mailto:ichensoul@gmail.com">chensoul</a>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class AuditBased extends IdBased implements Serializable, HasId {
    protected static final ObjectMapper mapper = new ObjectMapper();

    @JsonFormat(pattern = NORM_DATETIME_PATTERN)
    protected LocalDateTime createTime;

    @JsonFormat(pattern = NORM_DATETIME_PATTERN)
    protected LocalDateTime updateTime;

    public AuditBased() {
        super();
    }

    public AuditBased(String id) {
        super(id);
    }

    public AuditBased(AuditBased data) {
        super(data.getId());
        this.createTime = data.getCreateTime();
        this.updateTime = data.getUpdateTime();
    }
}
