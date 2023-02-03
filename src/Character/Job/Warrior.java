package Character.Job;

import Character.Stat.*;

public class Warrior extends Job{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitution)
            return stat.getValue()+constitutionBoost;
        if (stat instanceof Strength)
            return stat.getValue()+strengthBoost;
        return stat.getValue();
    }

    private final int strengthBoost = 3;
    private final int constitutionBoost = 2;
}