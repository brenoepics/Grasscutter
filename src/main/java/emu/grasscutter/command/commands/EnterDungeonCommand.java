package emu.grasscutter.command.commands;

import static emu.grasscutter.utils.lang.Language.translate;

import emu.grasscutter.command.*;
import emu.grasscutter.game.player.Player;
import java.util.List;

@Command(
        label = "enter_dungeon",
        aliases = {"enterdungeon", "dungeon"},
        usage = {"<dungeonId>"},
        permission = "player.enterdungeon",
        permissionTargeted = "player.enterdungeon.others")
public final class EnterDungeonCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        if (args.isEmpty()) {
            sendUsageMessage(sender);
            return;
        }

        try {
            int dungeonId = Integer.parseInt(args.get(0));
            if (dungeonId == targetPlayer.getSceneId()) {
                CommandHandler.sendMessage(
                        sender, translate(sender, "commands.enter_dungeon.in_dungeon_error"));
                return;
            }

            boolean result =
                    targetPlayer
                            .getServer()
                            .getDungeonSystem()
                            .enterDungeon(targetPlayer.getSession().getPlayer(), 0, dungeonId, true);

            if (!result) {
                CommandHandler.sendMessage(
                        sender, translate(sender, "commands.enter_dungeon.not_found_error"));
            } else {
                CommandHandler.sendMessage(
                        sender, translate(sender, "commands.enter_dungeon.changed", dungeonId));
            }
        } catch (Exception e) {
            sendUsageMessage(sender);
        }
    }
}
