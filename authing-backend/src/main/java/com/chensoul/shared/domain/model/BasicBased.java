package com.chensoul.shared.domain.model;

import lombok.Data;

@Data
public class BasicBased extends AuditBased implements HasCodeNameDescription {
    private String name;
    private String code;
    private String description;
}
