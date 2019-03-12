package api;

import api.Enums.Portion;
import api.Interfaces.Edible;

public class Meat extends Food implements Edible {

    public Meat(String name, String foodType, Portion calories, int amount) {
        super(name, foodType, calories, amount);
    }

    public boolean edible() {
        return true;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getFoodType() {
        return super.getFoodType();
    }

    @Override
    public void setFoodType(String foodType) {
        super.setFoodType(foodType);
    }

    @Override
    public int getCalories() {
        return super.getCalories();
    }

    @Override
    public void setCalories(Portion calories) {
        super.setCalories(calories);
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public void setAmount(int amount) {
        super.setAmount(amount);
    }

    @Override
    public String toString() {
        return "Husi: \n" +
                " nev: " + name + "\n" +
                " eteltipus: " + foodType + "\n" +
                " kcal: " + calories.getCalories() + "\n" +
                " mennyiseg: " + amount +
                "\n\n";
    }
}
