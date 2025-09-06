package com.vantagepoint.domain.common;

import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.UUID;

public abstract class Entity {
    private final UUID _id;

    protected Entity(UUID id) {
        if (id == null) {
            throw new IllegalArgumentException("An entity must have a valid identity.");
        }

        _id = id;
    }

    protected final UUID getId() {
        return _id;
    }

    @Override
    public final boolean equals(Object obj) {
        var eq = false;
        if (this == obj) {
            eq = true;
        } else if (obj != null) {
            if (obj instanceof Entity) {
                eq = _id == ((Entity)obj)._id;
            }
        }
        return eq;
    }

    @Override
    public final int hashCode() {
        return _id.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Entity: %s", _id);
    }
}
