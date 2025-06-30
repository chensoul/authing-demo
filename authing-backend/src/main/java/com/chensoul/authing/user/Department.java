package com.chensoul.authing.user;

import lombok.Data;

import java.util.Map;

/**
 * B2E场景，可以新增组织或者部门，部门需要挂在组织下面
 * B2B场景，新增用户池时，自动创建一个用户池名称的组织
 */
@Data
public class Department {
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

    //org、depart
    private String type;

    /**
     * 父id
     */
    private String parentId;

    /**
     * 是否包含子部门
     */
    private Boolean hasChildren;

    /**
     * 是否是虚拟
     */
    private Boolean isVirtualNode;

    /**
     * 负责人 ID
     */
    private String leaderUserIds;

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
