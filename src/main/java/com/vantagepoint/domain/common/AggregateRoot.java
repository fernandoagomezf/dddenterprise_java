package com.vantagepoint.domain.common;

import java.lang.String;
import java.util.UUID;

public abstract class AggregateRoot extends Entity {
    protected AggregateRoot() {
        super(UUID.randomUUID());
    }

    protected AggregateRoot(UUID id) {
        super(id);
    }

    @Override
    public String toString() {
        return String.format("Aggregate Root: %s", getId());
    }
}
