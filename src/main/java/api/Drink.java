package api;

import api.Enums.Portion;
import api.Interfaces.Edible;

public class Drink extends Food implements Edible {
    private String brand;
    private int alcoholContent;


    public Drink(String name, String foodType, Portion calories, int amount, String brand, int alcohol) {
        super(name, foodType, calories, amount);
        this.brand = brand;
        this.alcoholContent = alcohol;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(int alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    @Override
    public String toString() {
        return "Italok: \n" +
                " nev: " + name + "\n" +
                " eteltipus: " + foodType + "\n" +
                " kcal: " + calories.getCalories() + "\n" +
                " mennyiseg: " + amount + "\n" +
                " gyarto: "  + brand + "\n" +
                " alkoholtartalom: " + alcoholContent + "%" +
                "\n\n";
    }

    public boolean edible() {
        return false;
    }
}
