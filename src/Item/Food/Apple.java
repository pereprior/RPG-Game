package Item.Food;
import Character.Characters;
public class Apple extends Food{
    public Apple() {
        setPower(5);
    }
    @Override
    public void consumedBy(Characters character) {
        System.out.println(character.toString() + " consumed: " + this.getClass().getSimpleName());
    }
}
