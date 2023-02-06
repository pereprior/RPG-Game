package Character;

import Character.Job.*;
import Character.Race.*;
import Character.Stat.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void testToString() {
        Stat stat = new Strength(5);
        Job job = new Homeless();
        Race race = new Human();
        Character prueba = new Character("Pere", race, job, stat);
        prueba.receivesDamage(10);
        prueba.heals(5);
        System.out.println(prueba);
    }

}