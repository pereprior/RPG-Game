package Item.Food;
import Character.Characters;
public class Carrot extends Food{
    public Carrot() {
        setPower(15);
    }

    @Override
    public void consumedBy(Characters character) {
        System.out.println(character.toString() + " consumed: " + this.getClass().getSimpleName());
    }
}