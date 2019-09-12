package entities;

import toolsEnums.HealingItemType;

public class Cleric extends Entity {

    private HealingItemType healingItemType;

    public Cleric(int health, String name, String type, HealingItemType healingItemType) {
        super(health, name, type);

        this.healingItemType = healingItemType;
    }

    public HealingItemType getHealingItemType() {

        return healingItemType;
    }

}
