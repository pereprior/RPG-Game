package Item.Potion;

import Item.IConsumable;

public abstract class Potion implements IConsumable {
    public static void setPower(int power) {
        Potion.power = power;
    }
    public int getPower() {
        return power;
    }
    public String toString() {
        return this.getClass().getSimpleName();
    }
    private static int power;
}
