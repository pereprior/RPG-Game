package Character.Job;

import Character.Stat.*;

public class Warrior extends Job{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return strengthBoost;
        }
        if (stat instanceof Constitution) {
            return constitutionBoost;
        }
        else return 0;
    }

    private final int strengthBoost = 3;
    private final int constitutionBoost = 2;
}