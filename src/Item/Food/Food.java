package Item.Food;

import Character.Character;

public abstract class Food implements IConsumable {
    protected Food() {
        this.power = power;
    }

    @Override
    public void consumedBy(Character character) {

    }

    private final int power;
}
