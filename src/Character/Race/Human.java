package Character.Race;

import Character.Stat.*;

public class Human extends Race{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return dexterityBoost;
        }
        if (stat instanceof Strength) {
            return strengthBoost;
        }
        if (stat instanceof Constitution) {
            return constitutionBoost;
        }
        else return 0;
    }

    private final int dexterityBoost = 1;
    private final int strengthBoost = 2;
    private final int constitutionBoost = 2;
}
