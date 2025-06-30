package com.chensoul.authing.user;

import lombok.Data;

import java.util.Map;

@Data
public class Group {
    private String id;
    /**
     * 名称
     */
    private String name;

    /**
     * 识别码
     */
    private String code;

    /**
     * 描述
     */
    private String description;

    /**
     * 扩展数据
     */
    private Map<String, Object> customData;

    private String userPoolId;

    /**
     * 租户 ID，可以为空
     */
    private String tenantId;

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
