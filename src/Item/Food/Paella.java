package Item.Food;
import Character.Characters;
public class Paella extends Food{
    public Paella() {
        setPower(50);
    }

    @Override
    public void consumedBy(Characters character) {
        System.out.println(character.toString() + " consumed: " + this.getClass().getSimpleName());
    }
}
