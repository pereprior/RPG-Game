package Character.Job;

import Character.Stat.*;

public class Mage extends Job{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return dexterityBoost;
        }
        if (stat instanceof Intelligence) {
            return intelligenceBoost;
        }
        else return 0;
    }

    private final int intelligenceBoost = 4;
    private final int dexterityBoost = 1;

}
