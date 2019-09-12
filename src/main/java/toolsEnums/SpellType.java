package toolsEnums;

public enum SpellType {

    Fireball(40),
    LightningStrike(34);

        public int damage;

    SpellType(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
