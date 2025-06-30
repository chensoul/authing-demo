package com.chensoul.authing.user;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserGroup {
    private Long id;

    private String groupId;

    private String userId;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
}
