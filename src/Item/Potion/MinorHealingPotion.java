package Item.Potion;
import Character.Characters;
public class MinorHealingPotion extends Potion{
    public MinorHealingPotion() {
        setPower(25);
    }
    @Override
    public void consumedBy(Characters character) {
        System.out.println(character.toString() + " consumed: " + this.getClass().getSimpleName());
    }
}
