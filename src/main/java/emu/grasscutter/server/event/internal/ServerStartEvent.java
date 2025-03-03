package emu.grasscutter.server.event.internal;

import emu.grasscutter.server.event.types.ServerEvent;
import java.time.OffsetDateTime;
import lombok.Getter;

@Getter
public final class ServerStartEvent extends ServerEvent {
    private final OffsetDateTime startTime;

    public ServerStartEvent(Type type, OffsetDateTime startTime) {
        super(type);

        this.startTime = startTime;
    }
}
