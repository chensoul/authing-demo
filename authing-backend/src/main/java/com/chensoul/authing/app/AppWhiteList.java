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
package com.chensoul.authing.app;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppWhiteList {
    private String id;

    // PHONE,USERNAME,EMAIL
    private String type;

    private String value;

    private LocalDateTime createdAt;
}
