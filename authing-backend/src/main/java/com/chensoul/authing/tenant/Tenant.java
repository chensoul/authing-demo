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
package com.chensoul.authing.tenant;

import lombok.Data;

@Data
public class Tenant {
    private String id;

    private String name;
    private String code;
    private String description;
    private String logo;

    private String sourceAppId;

    private String source;

    /**
     * 企业邮箱域名
     */
    private String emailDomain;

    /**
     * 租户过期时间
     */
    private String expireTime;

    /**
     * 租户 MAU 上限
     */
    private Integer mauAmount;
    /**
     * 租户成员上限
     */
    private Integer memberAmount;

    /**
     * 租户管理员上限
     */
    private Integer adminAmount;

    private String userPoolId;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private String createdAt;
    /**
     * 修改时间
     */
    private String updatedAt;
}
