package entities;

import org.junit.Before;
import org.junit.Test;
import toolsEnums.AnimalType;
import toolsEnums.SpellType;

import static org.junit.Assert.assertEquals;
import static toolsEnums.AnimalType.Ogre;
import static toolsEnums.SpellType.Fireball;

public class WizardTest {

    Wizard wizard;

    @Before
    public void setUp(){

        wizard = new Wizard(100, "Gandalf",
                "Wizard Player", Fireball, Ogre);
    }

    @Test
    public void hasHealh(){
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void hasName(){
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Wizard Player", wizard.getType());
    }

    @Test
    public void hasSpellType(){
        assertEquals(Fireball, wizard.getSpellType());
    }

    @Test
    public void hasAnimalType(){
        assertEquals(Ogre, wizard.getAnimalType());
    }

}
