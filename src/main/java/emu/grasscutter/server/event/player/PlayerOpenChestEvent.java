package emu.grasscutter.server.event.player;

import emu.grasscutter.game.entity.gadget.GadgetChest;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.world.ChestReward;
import emu.grasscutter.server.event.Cancellable;
import emu.grasscutter.server.event.types.PlayerEvent;
import lombok.Getter;

@Getter
public final class PlayerOpenChestEvent extends PlayerEvent implements Cancellable {
    private final GadgetChest chest;
    private ChestReward reward;

    public PlayerOpenChestEvent(Player player, GadgetChest chest, ChestReward reward) {
        super(player);

        this.chest = chest;
        this.reward = reward;
    }

    public void setReward(ChestReward reward) {
        this.reward = reward;
    }

}
