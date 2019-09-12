package entities;

import toolsEnums.CollectableTool;
import toolsEnums.SpellType;

import java.util.ArrayList;

public abstract class Entity {
    private int health;
    private String name;
    private String type;
    private ArrayList<CollectableTool> inventory;

    public Entity(int health, String name, String type){
        this.inventory = new ArrayList<CollectableTool>();
        this.name = name;
        this.type = type;
        this.health = health;

    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public ArrayList<CollectableTool> getInventory() {
        return inventory;
    }


}
