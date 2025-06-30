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

import lombok.Data;

// 权益
@Data
public class RightModel {
    private String code;
    private String name;

    // 1：数量类型，2：数字只读，不做计量，3：断言类型，4：字符串只读
    private Integer dataType;
    private String dataValue;
}
