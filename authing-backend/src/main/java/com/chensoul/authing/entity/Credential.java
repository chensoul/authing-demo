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

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName
public class Credential {
    private Long id;

    private String userId;

    private String password;

    private String activateToken;

    private String resetToken;

    /**
     * 用户密码安全强度等级
     */
    private Integer passwordSecurityLevel;
    /**
     * 下次登录要求重置密码
     */
    private Boolean resetPasswordOnNextLogin;

    private Boolean resetPasswordOnFirstLogin;

    private LocalDateTime userPasswordExpireTime;

    /**
     * 用户上次密码修改时间
     */
    private String passwordLastSetAt;

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
