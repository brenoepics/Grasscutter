package emu.grasscutter.game.quest.exec;

import emu.grasscutter.data.excels.quest.QuestData;
import emu.grasscutter.game.quest.*;
import emu.grasscutter.game.quest.enums.QuestExec;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;

@QuestValueExec(QuestExec.QUEST_EXEC_SET_QUEST_GLOBAL_VAR)
public class ExecSetQuestGlobalVar extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        quest
                .getOwner()
                .getQuestManager()
                .setQuestGlobalVarValue(Integer.parseInt(paramStr[0]), Integer.parseInt(paramStr[1]));
        return true;
    }
}
