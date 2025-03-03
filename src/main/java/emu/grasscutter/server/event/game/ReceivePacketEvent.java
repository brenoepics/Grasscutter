package emu.grasscutter.server.event.game;

import emu.grasscutter.server.event.Cancellable;
import emu.grasscutter.server.event.types.ServerEvent;
import emu.grasscutter.server.game.GameSession;
import lombok.Getter;
import lombok.Setter;

@Getter
public final class ReceivePacketEvent extends ServerEvent implements Cancellable {
    private final GameSession gameSession;
    private final int packetId;
    @Setter private byte[] packetData;

    public ReceivePacketEvent(GameSession gameSession, int packetId, byte[] packetData) {
        super(Type.GAME);

        this.gameSession = gameSession;
        this.packetId = packetId;
        this.packetData = packetData;
    }
}
