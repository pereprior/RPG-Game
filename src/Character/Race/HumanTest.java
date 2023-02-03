package Character.Race;

import Character.Stat.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void modifier() {
        Stat strength = new Strength(5);
        Race human = new Human();
        human.modifier(strength);
        assertEquals(7,strength.getValue());
    }
}