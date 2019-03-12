package api;

import java.util.List;
import api.Exceptions.*;
import java.util.Iterator;

public class Refridgerator {
    private List<Food> fridge;

    public Refridgerator(List<Food> fridge) {
        this.fridge = fridge;
    }

    public void addMeat(Meat meat) {
        fridge.add(meat);
    }

    public void removeFood(String name) {
        Iterator<Food> list = getFridge().iterator();
        while(list.hasNext())
        {
            if(list.next().getName().equals(name))
            {
                list.remove();
            }
        }
    }

    public void addVegetable(Vegetable vegetable) {
        fridge.add(vegetable);
    }

    public void addDrink(Drink drink) {
        fridge.add(drink);
    }

    public List<Food> getFridge() {
        return fridge;
    }

    public String showMeatinFridge() throws EmptyFridgeException {
        if(fridge == null)
        {
            throw new EmptyFridgeException("The fridge is empty");
        }
        String meatList ="Meat: \n";

        for(Food food : fridge)
        {
            if(food instanceof Meat)
            {
                meatList += "\t" + food.getName() + "husibol " + food.getAmount() + " darab van a hűtőben.\n";
            }
        }
        return meatList;
    }

    public String showVegetableinFridge() throws EmptyFridgeException {
        if(fridge == null)
        {
            throw new EmptyFridgeException("The fridge is empty");
        }
        String vegetableList = "Vegetable: " + "\n";

        for(Food food : fridge)
        {
            if(food instanceof Vegetable)
            {
                vegetableList += "\t" + food.getName() + "bol " + food.getAmount() + " darab van a hűtőben.\n";
            }
        }
        return vegetableList;
    }

    public String showDrinksinFridge() throws EmptyFridgeException {
        if(fridge == null)
        {
            throw new EmptyFridgeException("The fridge is empty");
        }
        String drinkList ="Drink: \n";

        for(Food food : fridge)
        {
            if(food instanceof Drink)
            {
                drinkList += "\t" + food.getName() + "bol " + food.getAmount() + " darab van a hűtőben.\n";
            }
        }
        return drinkList;
    }

}
