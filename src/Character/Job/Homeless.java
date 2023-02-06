package Character.Job;

import Character.Stat.*;

public class Homeless extends Job{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return dexterityBoost;
        }
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

    private final int intelligenceBoost = 1;
    private final int dexterityBoost = 1;
    private final int strengthBoost = 1;
    private final int constitutionBoost = 2;

}
