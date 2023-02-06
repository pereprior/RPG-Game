package Character.Race;

import Character.Stat.*;

public class Orc extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return strengthBoost;
        }
        if (stat instanceof Intelligence) {
            return intelligenceBoost;
        }
        if (stat instanceof Constitution) {
            return constitutionBoost;
        }
        else return 0;
    }

    private final int intelligenceBoost = -3;
    private final int strengthBoost = 5;
    private final int constitutionBoost = 3;
}
