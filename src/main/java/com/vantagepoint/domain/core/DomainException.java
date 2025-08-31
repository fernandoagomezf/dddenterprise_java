package com.vantagepoint.domain.core;

import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;

public class DomainException extends RuntimeException {
    public DomainException() {
        super("A problem occurred within the domain.");
    }

    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
