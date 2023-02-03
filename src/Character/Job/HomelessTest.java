package Character.Job;

import Character.Stat.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomelessTest {

    @Test
    void modifier() {
        Stat strength = new Strength(5);
        Job homeless = new Homeless();
        homeless.modifier(strength);
        assertEquals(6,strength.getValue());
    }
}