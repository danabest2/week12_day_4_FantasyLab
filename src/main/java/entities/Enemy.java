package entities;

public class Enemy extends Entity {
    private int damage;
    public Enemy(int health, String name, String type, int  damage) {
        super(health, name, type);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
