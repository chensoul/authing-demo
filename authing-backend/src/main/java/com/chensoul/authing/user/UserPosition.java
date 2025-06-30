package com.chensoul.authing.user;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserPosition {
    private Long id;

    private String positionId;

    private String userId;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
}
