package emu.grasscutter.game.inventory;

import java.util.*;

public class EquipInventoryTab implements InventoryTab {
    private final Set<GameItem> items;
    private final int maxCapacity;

    public EquipInventoryTab(int maxCapacity) {
        this.items = new HashSet<>();
        this.maxCapacity = maxCapacity;
    }

    @Override
    public GameItem getItemById(int id) {
        return null;
    }

    @Override
    public void onAddItem(GameItem item) {
        this.items.add(item);
    }

    @Override
    public void onRemoveItem(GameItem item) {
        this.items.remove(item);
    }

    @Override
    public int getSize() {
        return this.items.size();
    }

    @Override
    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    @Override
    public int getItemCountById(int itemId) {
        return (int) items.stream().filter(item -> item.getItemId() == itemId).count();
    }
}
