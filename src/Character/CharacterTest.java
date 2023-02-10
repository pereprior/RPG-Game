package Character;

import Character.Job.*;
import Character.Race.*;
import Character.Stat.*;
import Item.Food.Food;
import Item.Food.Paella;
import Item.Potion.HealingPotion;
import Item.Potion.Potion;
import org.junit.jupiter.api.Test;

class CharacterTest {

    @Test
    void testFood() {
        Food paella = new Paella();
        Stat stat = new Strength(5);
        Job job = new Homeless();
        Race race = new Human();
        Characters prueba = new Characters("Pere", race, job, stat);
        prueba.receivesDamage(30);
        prueba.consumes(paella);
        System.out.println("-----------------");
    }

    @Test
    void TestPotion(){
        Stat stat = new Strength(5);
        Job job = new Homeless();
        Race race = new Human();
        Characters prueba = new Characters("Pere", race, job, stat);
        Potion pocion = new HealingPotion();
        prueba.receivesDamage(30);
        prueba.consumes(pocion);
        System.out.println("-----------------");
    }

    @Test
    void testToString() {
        Stat stat = new Strength(5);
        Job job = new Homeless();
        Race race = new Human();
        Characters prueba = new Characters("Pere", race, job, stat);
        System.out.println(prueba);
    }

}