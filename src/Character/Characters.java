package Character;

import Character.Job.*;
import Character.Race.*;
import Character.Stat.*;
import Item.Food.Food;
import Item.IConsumable;
import Item.Potion.Potion;

public class Characters implements IDamageable{

    public Characters(String name, Race race, Job job, Stat base){
        this.name=name;
        this.race=race;
        this.job=job;
        this.strength= new Strength(base.getValue());
        this.dexterity= new Dexterity(base.getValue());
        this.constitution= new Constitution(base.getValue());
        this.intelligence= new Intelligence(base.getValue());
        setStats();
    }

    public void setStats(){
        strength.setValue(statBoost(strength));
        dexterity.setValue(statBoost(dexterity));
        constitution.setValue(statBoost(constitution));
        intelligence.setValue(statBoost(intelligence));
        velocity();
        power();
        magic();
        maxHealth();
    }

    public int statBoost(Stat stat) {
        return stat.getValue() + race.modifier(stat) + job.modifier(stat);
    }

    public double velocity(){
        return dexterity.getValue()*2;
    }

    public double power(){
        return strength.getValue()*2;
    }

    public double magic(){
        return intelligence.getValue()*2;
    }

    @Override
    public String toString(){
        return "My name is " + name + ". I'm an " + race.toString() + " " + job.toString() + ". My stats are: " + "\nStrength: " + strength.getValue() + " - Dexterity: " + dexterity.getValue() + " - Constitution: " + constitution.getValue() + " - Intelligence: " + intelligence.getValue() + "\nVelocity: " + velocity() + " - Power: " + power() + " - Magic: " + magic()+ " - Health: " + health();
    }

    @Override
    public void maxHealth() {
        setHealth(constitution.getValue()*25);
        maxHealth=health;
    }

    public void consumes(IConsumable consumable){
        if (consumable instanceof Food)
            heals(((Food) consumable).getPower());

        if (consumable instanceof Potion)
            heals(((Potion) consumable).getPower());
    }

    @Override
    public double health() {
        return health;
    }

    @Override
    public boolean isDead() {
        return health > 0;
    }

    @Override
    public void receivesDamage(double amount) {
        setHealth(health-amount);
        System.out.println(name + " received " + amount + " damage. Health: " + health + "/" + maxHealth);
    }

    @Override
    public void heals(double amount) {
        double cure = health+amount;
        if (cure < maxHealth){
            setHealth(cure);
            System.out.println(name + " healed " + amount + " life. Health: " + health + "/" + maxHealth);
        }else{
            System.out.println(name + " healed " + (maxHealth-health) + " life. Health: " + maxHealth + "/" + maxHealth);
            setHealth(maxHealth);
        }
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

    public void setHealth(double health) {
        this.health = health;
    }

    private String name;
    private Race race;
    private Job job;
    private Stat strength;
    private Stat dexterity;
    private Stat constitution;
    private Stat intelligence;
    private double health;
    private double maxHealth;
}