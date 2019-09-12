package toolsEnums;

public enum AnimalType{

    Ogre(45),
    Dragon(60);

    public int resistance;

    AnimalType(int resistance){
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }
}
