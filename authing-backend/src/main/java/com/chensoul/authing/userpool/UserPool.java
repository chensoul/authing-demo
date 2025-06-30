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

@Data
public class UserPool {
    private String id; // 68020bd001975eda09b4593d

    private String logo;
    private String name;
    private String domain;
    private String description;
    private String type; //B2E B2B B2C
    private String userId;

    private Boolean deleted;

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

//    private Boolean isRoot;

//    private Long tokenExpiresAfter;
//
//    private Boolean appSsoEnabled;
//    private String allowedOrigins;
//    private Boolean emailVerifiedDefault;
//    private Boolean sendWelcomeEmail;
//    private Boolean registerDisabled;
//    private Boolean loginRequireEmailVerified;
//    private Boolean sendUpdatePwdEmailNotifyVerified;
//    private Boolean robotVerify;
//    private Boolean robotVerifyLoginTimeCheckEnable;
//    private Boolean robotVerifyLoginWeekStartEndTime;
//
//    private String accountLock;
//    private String loginFailStrategy;
//    private Boolean enableSelfUnlock;
//    private String selfUnlockStrategy; // password-captcha
//    private String userPoolTypes;
//    private Integer passwordStrength;
//    private Integer packageType;
//    private String packageMode; // standard
//    private Integer defaultNamespaceId;
//    private Integer systemNamespaceId;
//
//    private Integer verifyCodeLength;
//    private Integer verifyCodeMaxAttempts;
}
