package Item.Weapon.Weaporn;

import Character.Job.*;
import Character.Race.*;
import Character.Characters;
import Item.Weapon.IEquipable;

public abstract class Weaporn implements IEquipable {

    public String toString() {
        return this.getClass().getSimpleName();
    }

    public enum wClass {
        ONEHAND, TWOHAND
    }

    public boolean weightControl(Characters character){
        double endurance = character.getConstitution().getValue()*2;
        return weight < endurance;
    }

    protected int weight;
    private Job jAffinity;
    private Race rAffinity;
}
