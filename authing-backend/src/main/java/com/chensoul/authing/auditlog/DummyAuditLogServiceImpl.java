/**
 * Copyright © 2016-2025 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.chensoul.authing.auditlog;

import com.chensoul.shared.domain.model.HasName;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
@ConditionalOnProperty(prefix = "audit-log", value = "enabled", havingValue = "false")
public class DummyAuditLogServiceImpl implements AuditLogService {
    @Override
    public <E extends HasName, I extends Serializable> void logEntityAction(String userId, String userName, I entityId, E entity, com.chensoul.authing.auditlog.ActionType actionType, Exception e, Object... additionalInfo) {

    }
}
