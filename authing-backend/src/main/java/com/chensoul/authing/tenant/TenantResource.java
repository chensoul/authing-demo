package com.chensoul.authing.tenant;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TenantResource {
    private Long id;

    private String resourceId;

    private String tenantId;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
}
