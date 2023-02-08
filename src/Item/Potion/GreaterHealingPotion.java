package Item.Potion;
import Character.Characters;
public class GreaterHealingPotion extends Potion{
    public GreaterHealingPotion() {
        setPower(100);
    }
    @Override
    public void consumedBy(Characters character) {
        System.out.println(character.toString() + " consumed: " + this.getClass().getSimpleName());
    }
}