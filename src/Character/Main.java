package Character;

import Character.Job.Homeless;
import Character.Job.Job;
import Character.Race.Human;
import Character.Race.Race;
import Character.Stat.*;

public class Main {

    public static void main(String[] args) {
        Stat stat = new Strength(5);
        Job job = new Homeless();
        Race race = new Human();

        Character character = new Character("Pere", race, job, stat);
        System.out.println(character.toString());
    }

}
