package Character.Race;

import Character.Stat.*;

public class Monster extends Race {

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

    private final int dexterityBoost = -3;
    private final int strengthBoost = 4;
    private final int constitutionBoost = 4;
}
