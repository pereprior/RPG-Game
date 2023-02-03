package Character.Race;

import Character.Stat.*;

public class Human extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
            return stat.getValue()+dexterityBoost;
        if (stat instanceof Strength)
            return stat.getValue()+strengthBoost;
        if (stat instanceof Constitution)
            return stat.getValue()+constitutionBoost;
        else return stat.getValue();
    }

    private final int dexterityBoost = 1;
    private final int strengthBoost = 2;
    private final int constitutionBoost = 2;
}
