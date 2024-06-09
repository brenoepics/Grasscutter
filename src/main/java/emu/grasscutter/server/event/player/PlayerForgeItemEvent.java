package emu.grasscutter.server.event.player;

import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.server.event.types.PlayerEvent;
import lombok.*;

@Getter
public final class PlayerForgeItemEvent extends PlayerEvent {
    @Setter private GameItem itemForged;

    public PlayerForgeItemEvent(Player player, GameItem itemForged) {
        super(player);

        this.itemForged = itemForged;
    }
}
