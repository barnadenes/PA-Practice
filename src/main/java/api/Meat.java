package api;

import api.Enums.Portion;
import api.Interfaces.Edible;

public class Meat extends Food implements Edible {

    public Meat(String name, String foodType, Portion calories, int amount) {
        super(name, foodType, calories, amount);
    }

    public boolean edible() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
