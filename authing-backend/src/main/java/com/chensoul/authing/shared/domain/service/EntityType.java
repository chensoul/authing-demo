package com.chensoul.authing.shared.domain.service;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

public enum EntityType {
    TENANT,
    ;
    @Getter
    private final String normalName = StringUtils.capitalize(name().toLowerCase().replaceAll("_", " "));
}
