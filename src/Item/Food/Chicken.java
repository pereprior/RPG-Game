package Item.Food;
import Character.Characters;
public class Chicken extends Food{
    public Chicken() {
        setPower(25);
    }
    @Override
    public void consumedBy(Characters character) {
        System.out.println(character.toString() + " consumed: " + this.getClass().getSimpleName());
    }
}
