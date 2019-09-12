package entities;

import toolsEnums.ArmourType;
import toolsEnums.WeaponType;

public class Warrior extends Entity{

    private WeaponType weaponType;
    private ArmourType armourType;


    public Warrior(int health, String name, String type, WeaponType weaponType, ArmourType armourType) {
        super(health, name, type);
        this.weaponType = weaponType;
        this.armourType = armourType;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public ArmourType getArmourType() {
        return armourType;
    }
}
