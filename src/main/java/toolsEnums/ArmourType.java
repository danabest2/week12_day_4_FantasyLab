package toolsEnums;

public enum ArmourType {

    ArmourSilver(80),
    ArmourGold(50),
    Armour(40);

    public int resistance;
    ArmourType(int resistance){
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }
}
