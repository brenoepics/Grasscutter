package emu.grasscutter.game.managers.energy;

import lombok.Getter;

import java.util.List;

@Getter
public class SkillParticleGenerationEntry {
    private int avatarId;
    private List<SkillParticleGenerationInfo> amountList;

}
