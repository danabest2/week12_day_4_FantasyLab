package entities;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static toolsEnums.HealingItemType.Potion;

public class ClericTest {

    Cleric cleric;

    @Before

    public void setUp(){

    cleric = new Cleric(120, "Robert", "Cleric Player",
            Potion);

    }

    @Test
    public void hasHealth(){
        assertEquals(120, cleric.getHealth());
    }

    @Test
    public void hasName(){
        assertEquals("Robert", cleric.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Cleric Player", cleric.getType());
    }

    @Test
    public void hasHealingItemType(){
        assertEquals(Potion, cleric.getHealingItemType());
    }

}
