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
        return "Drinks{" +
                "brand='" + brand + '\'' +
                ", alcoholContent=" + alcoholContent +
                '}';
    }

    public boolean edible() {
        return false;
    }
}
