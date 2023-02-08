package Item.Food;
import Character.Characters;
public class Bread extends Food{
    public Bread() {
        setPower(10);
    }
    @Override
    public void consumedBy(Characters character) {
        System.out.println(character.toString() + " consumed: " + this.getClass().getSimpleName());
    }
}
