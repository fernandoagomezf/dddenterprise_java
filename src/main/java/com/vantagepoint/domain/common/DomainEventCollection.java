package com.vantagepoint.domain.common;

import java.lang.IllegalStateException;
import java.lang.NullPointerException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public final class DomainEventCollection implements Iterable<DomainEvent> {
    private final AggregateRoot _owner;
    private final Queue<DomainEvent> _events;

    public DomainEventCollection(AggregateRoot owner) {
        if (owner == null) {
            throw new NullPointerException("The owner cannot be null.");
        }
        _owner = owner;
        _events = new LinkedList<>();
    }

    public final AggregateRoot getOwner() {
        return _owner;
    }

    public final void publish(DomainEvent event) {
        if (event == null) {
            throw new NullPointerException("The event cannot be null.");
        }
    }

    public final DomainEvent handle() {
        if (_events.isEmpty()) {
            throw new IllegalStateException("No events to handle");
        }
        return _events.poll();
    }

    @Override
    public final Iterator<DomainEvent> iterator() {
        return _events.iterator();
    }

    public final int size() {
        return _events.size();
    }

    public final boolean isEmpty() {
        return _events.isEmpty();
    }

    public final void clear() {
        _events.clear();
    }
}
