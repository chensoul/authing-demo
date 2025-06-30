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
package com.chensoul.authing.userpool;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Package {
    private Long id;

    private String accountNo;
    private String instanceNo;

    private String name;
    private String code;

    // 套餐包版本: standard,Enterprise
    private String group;

    // 套餐包场景编码: B2E,B2C
    private String sceneCode;

    // 套餐包单价
    private Long unitPrice;

    // 套餐包 MAU 数量
    private Long amount;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
