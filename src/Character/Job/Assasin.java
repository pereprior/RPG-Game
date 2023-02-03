package Character.Job;

import Character.Stat.*;

public class Assasin extends Job{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
            return stat.getValue()+dexterityBoost;
        if (stat instanceof Constitution)
            return stat.getValue()+constitutionBoost;
        if (stat instanceof Strength)
            return stat.getValue()+strengthBoost;
        return stat.getValue();
    }

    private final int dexterityBoost = 3;
    private final int strengthBoost = 1;
    private final int constitutionBoost = 1;

}
