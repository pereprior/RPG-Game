package Character.Stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrengthTest {

    @Test
    void getValue() {
        Stat potencia = new Strength(5);
        assertEquals(5,potencia.getValue());
    }

    @Test
    void increase() {
        Stat potencia = new Strength(5);
        potencia.increase(1);
        assertEquals(6,potencia.getValue());
    }

    @Test
    void decrease() {
        Stat potencia = new Strength(5);
        potencia.decrease(1);
        assertEquals(4,potencia.getValue());
    }

}