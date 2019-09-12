package entities;

import toolsEnums.AnimalType;
import toolsEnums.SpellType;

public class Wizard extends Entity{
    private SpellType spellType;
    private AnimalType animalType;

    public Wizard(int health, String name, String type, SpellType spellType, AnimalType animalType) {
        super(health, name, type);

        this.spellType = spellType;
        this.animalType = animalType;
    }

    public SpellType getSpellType() {
        return spellType;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }


}
