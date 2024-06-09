package emu.grasscutter.data.binout;

import emu.grasscutter.data.binout.AbilityModifier.AbilityModifierAction;
import java.util.*;

public class AbilityModifierEntry {
    public final List<AbilityModifierAction> onModifierAdded;
    public final List<AbilityModifierAction> onThinkInterval;
    public final List<AbilityModifierAction> onRemoved;
    private final String name; // Custom value

    public AbilityModifierEntry(String name) {
        this.name = name;
        this.onModifierAdded = new ArrayList<>();
        this.onThinkInterval = new ArrayList<>();
        this.onRemoved = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<AbilityModifierAction> getOnAdded() {
        return onModifierAdded;
    }

    public List<AbilityModifierAction> getOnThinkInterval() {
        return onThinkInterval;
    }

    public List<AbilityModifierAction> getOnRemoved() {
        return onRemoved;
    }
}
