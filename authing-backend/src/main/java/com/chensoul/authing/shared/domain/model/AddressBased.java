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

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

/**
 * @param <I>
 * @author <a href="mailto:ichensoul@gmail.com">chensoul</a>
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class AddressBased<I extends Serializable> extends AuditBased implements HasId {
    /**
     * 所在国家
     */
    protected String country;
    /**
     * 所在省份
     */
    protected String province;
    /**
     * 所在城市
     */
    protected String city;

    /**
     * 用户所在区域
     */
    protected String region;

    /**
     * 所处街道地址
     */
    protected String streetAddress;

    /**
     * 所处地址
     */
    protected String address;

    /**
     * 标准的完整地址
     */
    protected String formatted;

    /**
     * 邮政编码号
     */
    protected String postalCode;
}
