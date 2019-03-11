package api;

import api.Enums.MeatType;
import api.Enums.Portion;
import api.Interfaces.Edible;

public class Meat extends Food implements Edible {
    private MeatType color;

    public Meat(String name, String foodType, Portion calories, int amount, MeatType color) {
        super(name, foodType, calories, amount);
        this.color = color;
    }

    public boolean edible() {
        return false;
    }

    public MeatType getColor() {
        return color;
    }
}
