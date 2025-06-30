package com.chensoul.shared.domain.model;

import java.io.Serializable;
import java.util.UUID;

public abstract class UUIDBased implements HasUUID, Serializable {
    private static final long serialVersionUID = 1L;
    private final UUID id;

    public UUIDBased() {
        this(UUID.randomUUID());
    }

    public UUIDBased(UUID id) {
        super();
        this.id = id;
    }

    public String getId() {
        return id.toString().replaceAll("-", "");
    }
}
