package Character.Race;

import Character.Stat.*;

public class Orc extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
            return stat.getValue()+intelligenceBoost;
        if (stat instanceof Strength)
            return stat.getValue()+strengthBoost;
        if (stat instanceof Constitution)
            return stat.getValue()+constitutionBoost;
        else return stat.getValue();
    }

    private final int intelligenceBoost = -3;
    private final int strengthBoost = 5;
    private final int constitutionBoost = 3;
}
