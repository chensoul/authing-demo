package com.chensoul.authing.user;

import com.chensoul.authing.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Map;

/**
 * withCustomData
 * withDepartment
 * withLastLogin
 * withTenant
 * withUserSource
 */
@Data
public class User extends Address {
    private String id;

    //personal,public
    private String type;

    /**
     * 账户当前状态：
     * - Activated: 正常状态
     * - Suspended: 已停用
     * - Deactivated: 已禁用
     * - Resigned: 已离职
     * - Archived: 已归档
     */
    private Status status;

    /**
     * 用户名，用户池内唯一
     */
    private String username;
    /**
     * 用户真实名称，不具备唯一性
     */
    private String name;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 头像链接
     */
    private String avatar;

    /**
     * 性别:
     * - `M`: 男性，`male`
     * - `F`: 女性，`female`
     * - `U`: 未知，`unknown`
     */
    private Gender gender;

    /**
     * 邮箱，不区分大小写
     */
    private String email;
    /**
     * 手机号，不带区号。如果是国外手机号，请在 phoneCountryCode 参数中指定区号。
     */
    private String phone;
    /**
     * 手机区号，中国大陆手机号可不填。Authing 短信服务暂不内置支持国际手机号，你需要在 Authing 控制台配置对应的国际短信服务。完整的手机区号列表可参阅 https://en.wikipedia.org/wiki/List_of_country_calling_codes。
     */
    private String phoneCountryCode;

    /**
     * 邮箱是否验证
     */
    private Boolean emailVerified;

    /**
     * 手机号是否验证
     */
    private Boolean phoneVerified;

    /**
     * 出生日期
     */
    private String birthdate;

    /**
     * 名
     */
    private String givenName;
    /**
     * 姓
     */
    private String familyName;
    /**
     * 中间名
     */
    private String middleName;
    /**
     * Preferred Username
     */
    private String profile;
    /**
     * Preferred Username
     */
    private String preferredUsername;

    /**
     * 用户身份证号码
     */
    private String identityNumber;

    /**
     * 用户个人网页
     */
    private String website;

    /**
     * 账户当前工作状态
     */
    private WorkStatus workStatus;

    /**
     * 所在公司
     */
    private String company;

    /**
     * 注册方式：import:manual
     */
    private String registerSource;

    /**
     * 来源类型:
     * - `excel`: 通过 excel 导入
     * - `register`: 用户自主注册
     * - `adminCreated`: 管理员后台手动创建（包含使用管理 API 创建用户 ）
     * - `syncTask`: 同步中心的同步任务
     */
    private UserSourceType userSourceType;
    /**
     * 应用 ID 或者同步任务 ID
     */
    private String userSourceId;

    /**
     * 第三方外部 ID
     */
    private String externalId;

    /**
     * 扩展数据
     */
    private Map<String, Object> customData;

    /**
     * 状态上次修改时间
     */
    private String statusChangedAt;

    private String userPoolId;

    /**
     * 租户 ID 为空时是用户池用户；不为空时时租户的用户
     */
    private String tenantId;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;

    /**
     * 账户当前状态：
     * - Activated: 正常状态
     * - Suspended: 已停用
     * - Deactivated: 已禁用
     * - Resigned: 已离职
     * - Archived: 已归档
     */
    @Getter
    @AllArgsConstructor
    public static enum Status {
        SUSPENDED("Suspended"),
        RESIGNED("Resigned"),
        ACTIVATED("Activated"),
        ARCHIVED("Archived"),
        DEACTIVATED("Deactivated"),
        ;
        private String value;
    }

    /**
     * 账户当前工作状态
     */
    @Getter
    @AllArgsConstructor
    public static enum WorkStatus {
        CLOSED("Closed"),
        ACTIVE("Active"),
        ;
        private String value;
    }

    /**
     * 性别:
     * - `M`: 男性，`male`
     * - `F`: 女性，`female`
     * - `U`: 未知，`unknown`
     */
    @Getter
    @AllArgsConstructor
    public static enum Gender {
        M("M"),
        F("F"),
        U("U"),
        ;
        private String value;
    }

    /**
     * 来源类型:
     * - `excel`: 通过 excel 导入
     * - `register`: 用户自主注册
     * - `adminCreated`: 管理员后台手动创建（包含使用管理 API 创建用户 ）
     * - `syncTask`: 同步中心的同步任务
     */
    @Getter
    @AllArgsConstructor
    public static enum UserSourceType {
        EXCEL("excel"),
        REGISTER("register"),
        ADMIN_CREATED("adminCreated"),
        SYNC("sync"),
        WORKFLOW("workflow"),
        ;
        private String value;
    }
}
