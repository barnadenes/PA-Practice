package api;
import api.Exceptions.AteTooMuchException;
import api.Exceptions.EmptyFridgeException;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int calories;
    private Refridgerator myFridge;
    private List<Food> foodInFridge;


    public User(String name, int calories) {
        this.name = name;
        this.calories = calories;
        this.foodInFridge = new ArrayList<Food>();
        this.myFridge = new Refridgerator(foodInFridge);
    }

    //Kivesz a hűtőböl és számolja a kalóriát.
    public void getFood(Food food) throws EmptyFridgeException, AteTooMuchException {
        if(!(myFridge.getFridge().isEmpty()))
        {
            throw new EmptyFridgeException("Empty fridge");
        }
        foodInFridge.remove(food);
        calories -= food.getCalories();
        if(this.calories < 0)
        {
            throw new AteTooMuchException("Túllépted a napi kalória szükségleted.");
        }
    }

    // Kaját vagy piát pakol a user saját hűtőjébe.
    public void addFood(Food food) {
        foodInFridge.add(food);
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Név: " + name  +
               "Ennyi kalóriát fogyaszthatsz még: " + calories;
    }
}
