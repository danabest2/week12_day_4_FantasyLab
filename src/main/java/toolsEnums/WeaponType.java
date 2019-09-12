package toolsEnums;

public enum WeaponType {
    Sword(90),
    Axe(46),
    Club(55);

    public int damage;

    WeaponType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
