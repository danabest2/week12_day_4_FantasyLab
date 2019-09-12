package toolsEnums;

public enum HealingItemType {
    Potion(70),
    Herbs(90);

    public int replenishment;

    HealingItemType(int replenishment) {
        this.replenishment = replenishment;
    }

    public int getReplenishment() {
        return replenishment;
    }
}
