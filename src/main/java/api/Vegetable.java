package api;

import api.Enums.Portion;
import api.Interfaces.Edible;

public class Vegetable extends Food implements Edible {


    public Vegetable(String name, String foodType, Portion calories, int amount) {
        super(name, foodType, calories, amount);
    }

    //if fridge is off then its false;
    public boolean edible() {
        return false;
    }

    /*public boolean isState() {
        if(this.state.equals("raw".toLowerCase()))
        {
            return true;
        }
        return false;
    }*/

    @Override
    public String toString() {
        return super.toString();
    }
}
