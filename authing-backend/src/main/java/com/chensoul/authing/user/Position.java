package com.chensoul.authing.user;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Position {
    private String id;

    /**
     * 分组名称
     */
    private String name;
    /**
     * 分组 code
     */
    private String code;

    /**
     * 分组描述
     */
    private String description;

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
    private LocalDateTime createdAt;
    /**
     * 修改时间
     */
    private LocalDateTime updatedAt;
}