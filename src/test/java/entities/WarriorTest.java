package entities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static toolsEnums.AnimalType.Ogre;
import static toolsEnums.ArmourType.ArmourSilver;
import static toolsEnums.SpellType.Fireball;
import static toolsEnums.WeaponType.Sword;

public class WarriorTest {

    Warrior warrior;

    @Before

    public void setUp(){
        warrior = new Warrior(130, "Wolf", "Wolf Player", Sword, ArmourSilver);}

    @Test
    public void hasHealh(){
        assertEquals(130, warrior.getHealth());
    }

    @Test
    public void hasName(){
        assertEquals("Wolf", warrior.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Wolf Player", warrior.getType());
    }

    @Test
    public void hasWeaponType(){
        assertEquals(Sword, warrior.getWeaponType());
    }

    @Test
    public void hasArmourType(){
        assertEquals(ArmourSilver, warrior.getArmourType());
    }

}

