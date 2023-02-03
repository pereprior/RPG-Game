package Character.Race;

import Character.Stat.*;

public class Fairy extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
            return stat.getValue()+dexterityBoost;
        if (stat instanceof Strength)
            return stat.getValue()+strengthBoost;
        if (stat instanceof Intelligence)
            return stat.getValue()+intelligenceBoost;
        else return stat.getValue();
    }

    private final int dexterityBoost = 4;
    private final int strengthBoost = -4;
    private final int intelligenceBoost = 5;
}
