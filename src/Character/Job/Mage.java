package Character.Job;

import Character.Stat.*;

public class Mage extends Job{

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
            return stat.getValue()+intelligenceBoost;
        if (stat instanceof Dexterity)
            return stat.getValue()+dexterityBoost;
        return stat.getValue();
    }

    private final int intelligenceBoost = 4;
    private final int dexterityBoost = 1;

}
