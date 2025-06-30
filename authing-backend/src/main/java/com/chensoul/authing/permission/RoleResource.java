package com.chensoul.authing.permission;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RoleResource {
    private Long id;

    private String roleId;

    private String resourceType;

    private String resourceCode;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 资源类型
     */
    public static enum ResourceType {
        DATA("DATA"),

        API("API"),

        MENU("MENU"),

        BUTTON("BUTTON"),

        UI("UI"),
        ;

        private String value;

        ResourceType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
