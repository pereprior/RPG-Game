package Item.Food;

import Character.Character;

public abstract class Food implements IConsumable {
    public static void setPower(int power) {
        Food.power = power;
    }
    @Override
    public void consumedBy(Character character) {
        character.heals(power);
    }
    public static int getPower() {
        return power;
    }
    public String toString() {
        return this.getClass().getSimpleName();
    }

    private static int power;
}
