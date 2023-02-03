package Character;

import Character.Job.*;
import Character.Race.*;
import Character.Stat.*;

public class Character {

    public Character(String name, Race race, Job job, Stat stat){
        statBase=stat.getValue();
        this.name=name;
        this.race=race;
        this.job=job;
        this.strength=stat;
        this.dexterity=stat;
        this.constitution=stat;
        this.intelligence=stat;
        velocity();
        power();
        magic();
    }

    public double velocity(){
        return race.modifier(dexterity)+job.modifier(dexterity)-statBase;
    }

    public double power(){
        return race.modifier(strength)+job.modifier(strength)-statBase;
    }

    public double magic(){
        return race.modifier(intelligence)+job.modifier(intelligence)-statBase;
    }

    @Override
    public String toString(){
        return "My name is " + name + ". I'm an " + race.toString() + " " + job.toString() + ". My stats are: " + "\nStrength: " + strength.getValue() + " - Dexterity: " + dexterity.getValue() + " - Constitution: " + constitution.getValue() + " - Intelligence: " + intelligence.getValue() + " - Velocity: " + velocity() + " - Power: " + power() + " - Magic: " + magic();
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public Job getJob() {
        return job;
    }


    private int statBase;
    private String name;
    private Race race;
    private Job job;
    private Stat strength;
    private Stat dexterity;
    private Stat constitution;
    private Stat intelligence;

}