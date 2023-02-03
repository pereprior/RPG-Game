package Character.Job;

import Character.Stat.*;

public class Swordman extends Job{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength)
            return stat.getValue()+strengthBoost;
        if (stat instanceof Intelligence)
            return stat.getValue()+intelligenceBoost;
        if (stat instanceof Dexterity)
            return stat.getValue()+dexterityBoost;
        return stat.getValue();
    }

    private final int intelligenceBoost = 1;
    private final int dexterityBoost = 3;
    private final int strengthBoost = 1;

}
