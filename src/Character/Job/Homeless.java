package Character.Job;

import Character.Stat.*;

public class Homeless extends Job{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
            return stat.getValue()+intelligenceBoost;
        if (stat instanceof Dexterity)
            return stat.getValue()+dexterityBoost;
        if (stat instanceof Strength)
            return stat.getValue()+strengthBoost;
        if (stat instanceof Constitution)
            return stat.getValue()+constitutionBoost;
        return stat.getValue();
    }

    private final int intelligenceBoost = 1;
    private final int dexterityBoost = 1;
    private final int strengthBoost = 1;
    private final int constitutionBoost = 2;

}
