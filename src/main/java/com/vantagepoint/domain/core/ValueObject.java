package com.vantagepoint.domain.core;

import java.lang.Object;
import java.util.Arrays;
import java.util.Objects;

public abstract class ValueObject {
    protected ValueObject() {

    }

    @Override
    public final boolean equals(Object obj) {
        var eq = false;
        if (this == obj) {
            eq = true;
        } else if (obj != null ) {
            if (obj instanceof ValueObject) {
                var thisComponents = getComponents();
                var objComponents = ((ValueObject)obj).getComponents();
                eq = Objects.deepEquals(thisComponents, objComponents);
            }
        }

        return eq;
    }

    @Override
    public final int hashCode() {
        var components = getComponents();
        return Objects.hash(components);
    }

    @Override 
    public String toString() {
        var components = getComponents();
        return String.format("ValueObject: %s", Arrays.toString(components));
    }


    protected abstract Object[] getComponents();
}
