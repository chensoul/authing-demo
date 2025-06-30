package com.chensoul.authing.auditlog;

import com.chensoul.authing.shared.domain.model.HasName;
import com.chensoul.authing.shared.domain.service.EntityType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Slf4j
@Service
@RequiredArgsConstructor
@ConditionalOnProperty(prefix = "audit-log", value = "enabled", havingValue = "true")
public class AuditLogServiceImpl implements AuditLogService {
    private final AuditLogLevelFilter auditLogLevelFilter;

    @Override
    public <E extends HasName, I extends Serializable> void
    logEntityAction(String userId, String userName,
                    I entityId, E entity, ActionType actionType, Exception e, Object... additionalInfo) {

    }

    private boolean canLog(EntityType entityType, ActionType actionType) {
        return auditLogLevelFilter.logEnabled(entityType, actionType);
    }

}
