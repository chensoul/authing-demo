/**
 * Copyright © 2016-2025 The Thingsboard Authors
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.chensoul.shared.domain.service;


import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.chensoul.shared.domain.model.*;

import java.io.Serializable;
import java.util.Optional;
import java.util.function.Function;

public interface EntityService {
    Optional<HasId> findById(Serializable id);

//    default Pageable findAllByTenantId(String tenantId, Page page) {
//        throw new UnsupportedOperationException();
//    }

    default long countByTenantId(String tenantId) {
        throw new IllegalArgumentException("Not implemented for " + getEntityType());
    }

    default void deleteById(String id) {
        throw new IllegalArgumentException(getEntityType().getNormalName() + " deletion not supported");
    }

    default void deleteByTenantId(String tenantId) {
        throw new IllegalArgumentException("Deletion by tenant id not supported for " + getEntityType().getNormalName());
    }

    default Optional<String> fetchEntityName(Serializable entityId) {
        return fetchAndConvert(entityId, this::getName);
    }

    default Optional<String> fetchEntityCode(Serializable entityId) {
        return fetchAndConvert(entityId, this::getCode);
    }

    default String getCode(HasId entity) {
        return entity instanceof HasCode ? ((HasCode) entity).getCode() : null;
    }

    default String getName(HasId entity) {
        if (entity instanceof HasName && StringUtils.isNotEmpty(((HasName) entity).getName())) {
            return ((HasName) entity).getName();
        }
        if (entity instanceof HasPhone && StringUtils.isNotEmpty(((HasPhone) entity).getPhone())) {
            return ((HasPhone) entity).getPhone();
        }
        if (entity instanceof HasEmail && StringUtils.isNotEmpty(((HasEmail) entity).getEmail())) {
            return ((HasEmail) entity).getEmail();
        }
        return null;
    }

    default <T> Optional<T> fetchAndConvert(Serializable entityId, Function<HasId, T> converter) {
        Optional<HasId> entityOpt = findById(entityId);
        return entityOpt.map(converter);
    }

    EntityType getEntityType();

}
