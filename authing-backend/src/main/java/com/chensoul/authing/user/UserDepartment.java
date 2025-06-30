package com.chensoul.authing.user;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDepartment {
    private Long id;

    private String departmentId;

    private String userId;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
}
