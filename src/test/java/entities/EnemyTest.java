package entities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void setUp(){
        enemy = new Enemy(60,"Troll","enemy player", 20);
    }

    @Test
    public void hasDamage(){
        assertEquals(20, enemy.getDamage());
    }
}
