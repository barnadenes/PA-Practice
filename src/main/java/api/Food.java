package api;

import api.Enums.Portion;

public abstract class Food{
    private String name;
    private String foodType;
    private Portion calories;
    private int amount;

    public Food(String name, String foodType, Portion calories, int amount) {
        this.name = name;
        this.foodType = foodType;
        this.calories = calories;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Portion getCalories() {
        return calories;
    }

    public void setCalories(Portion calories) {
        this.calories = calories;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", foodType='" + foodType + '\'' +
                ", calories=" + calories +
                ", amount=" + amount +
                '}';
    }
}
