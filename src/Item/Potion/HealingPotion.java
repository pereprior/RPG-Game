package Item.Potion;
import Character.Characters;
public class HealingPotion extends Potion{
    public HealingPotion() {
        setPower(50);
    }
    @Override
    public void consumedBy(Characters character) {
        System.out.println(character.toString() + " consumed: " + this.getClass().getSimpleName());
    }
}