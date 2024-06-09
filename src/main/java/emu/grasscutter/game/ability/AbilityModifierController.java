package emu.grasscutter.game.ability;

import emu.grasscutter.data.binout.*;
import lombok.Getter;

public class AbilityModifierController {
    @Getter private final Ability ability;

    @Getter private final AbilityData abilityData;
    @Getter private final AbilityModifier modifierData;

    public AbilityModifierController(
            Ability ability, AbilityData abilityData, AbilityModifier modifierData) {
        this.ability = ability;
        this.abilityData = abilityData;
        this.modifierData = modifierData;
    }
}
