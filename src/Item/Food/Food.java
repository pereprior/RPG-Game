package Item.Food;

import Item.IConsumable;

public abstract class Food implements IConsumable {
    public static void setPower(int power) {
        Food.power = power;
    }
    public int getPower() {
        return power;
    }
    public String toString() {
        return this.getClass().getSimpleName();
    }
    private static int power;
}
