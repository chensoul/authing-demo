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

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AccessKey {
    private Long id;
    private String accessKeyId;
    private String accessKeySecret;
    private String status; // activated,staging,revoked
    private String type; // userpool
    private String userId;
    private String userPoolId;
    private Boolean enabled;
    private String tenantId;
    private LocalDateTime revokedAt;
    private LocalDateTime createdAt;
}
