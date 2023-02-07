package Character;

import Character.Job.*;
import Character.Race.*;
import Character.Stat.*;
import Item.Food.Apple;
import Item.Food.Food;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void testToString() {
        Stat stat = new Strength(5);
        Job job = new Homeless();
        Race race = new Human();
        Character prueba = new Character("Pere", race, job, stat);
        System.out.println(prueba);
    }

    @Test
    void testDamage(){
        Stat stat = new Strength(5);
        Job job = new Homeless();
        Race race = new Human();
        Character prueba = new Character("Pere", race, job, stat);
        prueba.receivesDamage(10);
        prueba.heals(200);
    }

    @Test
    void testFood(){
        Food pom = new Apple();
        Stat stat = new Strength(5);
        Job job = new Homeless();
        Race race = new Human();
        Character prueba = new Character("Pere", race, job, stat);
        prueba.receivesDamage(10);
        prueba.consumes(pom);
    }

}