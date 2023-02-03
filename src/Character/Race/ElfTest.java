package Character.Race;

import Character.Stat.Stat;
import Character.Stat.Strength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfTest {

    @Test
    void modifier() {
        Stat strength = new Strength(5);
        Race elf = new Elf();
        elf.modifier(strength);
        assertEquals(4,strength.getValue());
    }
}