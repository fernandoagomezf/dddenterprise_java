package com.vantagepoint.domain.common;

import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.String;
import java.time.LocalDateTime;

public final class DomainEvent extends ValueObject {
    private final String _code;
    private final LocalDateTime _raised;

    public DomainEvent(String code, LocalDateTime raised) {
        if (code == null) {
            throw new IllegalArgumentException("The code is mandatory.");
        }
        if (raised == null) {
            throw new IllegalArgumentException("The raised date is mandatory.");
        }
        _code = code;
        _raised = raised;
    }

    public DomainEvent(String code) {
        this(code, LocalDateTime.now());
    }

    public final String getCode() {
        return _code;
    }

    public final LocalDateTime getRaised() {
        return _raised;
    }

    @Override 
    protected final Object[] getComponents() {
        return new Object[] {
            _code, _raised
        };
    }
}
