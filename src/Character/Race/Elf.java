package Character.Race;

import Character.Stat.*;

public class Elf extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return dexterityBoost;
        }
        if (stat instanceof Strength) {
            return strengthBoost;
        }
        if (stat instanceof Intelligence) {
            return intelligenceBoost;
        }
        else return 0;
    }

    private final int dexterityBoost = 3;
    private final int strengthBoost = -1;
    private final int intelligenceBoost = 3;
}
