package emu.grasscutter.server.event.game;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.server.event.types.GameEvent;
import emu.grasscutter.server.game.GameSession;
import lombok.Getter;

@Getter
public final class PlayerCreationEvent extends GameEvent {
    private final GameSession session;
    private Class<? extends Player> playerClass;

    public PlayerCreationEvent(GameSession session, Class<? extends Player> playerClass) {
        this.session = session;
        this.playerClass = playerClass;
    }

    public void setPlayerClass(Class<? extends Player> playerClass) {
        this.playerClass = playerClass;
    }
}
