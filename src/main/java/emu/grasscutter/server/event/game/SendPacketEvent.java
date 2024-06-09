package emu.grasscutter.server.event.game;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.server.event.Cancellable;
import emu.grasscutter.server.event.types.ServerEvent;
import emu.grasscutter.server.game.GameSession;
import lombok.Getter;

@Getter
public final class SendPacketEvent extends ServerEvent implements Cancellable {
    private final GameSession gameSession;
    private BasePacket packet;

    public SendPacketEvent(GameSession gameSession, BasePacket packet) {
        super(Type.GAME);

        this.gameSession = gameSession;
        this.packet = packet;
    }

    public void setPacket(BasePacket packet) {
        this.packet = packet;
    }
}
