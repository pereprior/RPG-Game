package Item.Weapon.Weaporn;

import Character.Job.*;
import Character.Race.*;
import Character.Characters;

public class Shield extends Weaporn{
    public Shield(Characters characters){
        characters.getConstitution().increase(2);
        characters.getStrength().increase(1);
        characters.getDexterity().decrease(1);
        weight += 2;
        //setJobAffinity(characters.getJob());
        //setRaceAffinity(characters.getRace());
    }

    /*public void setJobAffinity(Job job){
        if (job instanceof Assasin){
            power ++;
        }
        if (job instanceof Swordman){
            power += 3;
        }
        if (job instanceof Homeless){
            power --;
        }
        if (job instanceof Mage){
            power -= 3;
        }
    }

    public void setRaceAffinity(Race race){
        if (race instanceof Elf){
            power ++;
        }
        if (race instanceof Human){
            power += 3;
        }
        if (race instanceof Orc){
            power --;
        }
        if (race instanceof Fairy){
            power -= 3;
        }
    }*/

    @Override
    public void equipBy(Characters characters) {

    }
}
