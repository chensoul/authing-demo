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
package com.chensoul.authing.entity;

import lombok.Data;

@Data
public class Usage {
    private Long id;

    private Long packageId;

    // 权益总量
    private Long amount;

    // 权益当前使用量
    private Long current;

    // 是否是体验期权益
    private Boolean experience;

    // 权益编码
    private String modelCode;

    // 权益名称
    private String modelName;
}
