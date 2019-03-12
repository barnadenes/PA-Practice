package cmd;

import api.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        XmlLoader xml = new XmlLoader();
        List<Food> fridge = new ArrayList<Food>();
        /*for(int i = 0; i < xml.getMeat().size(); i++){
            fridge.add(xml.getMeat().get(i));
        }
        for(int i = 0; i < xml.getVegetable().size(); i++){
            fridge.add(xml.getVegetable().get(i));
        }
        for(int i = 0; i < xml.getDrinks().size(); i++){
            fridge.add(xml.getDrinks().get(i));
        }*/
        fridge.addAll(xml.getMeat());
        fridge.addAll(xml.getVegetable());
        fridge.addAll(xml.getDrinks());





        Refridgerator refridgerator = new Refridgerator(fridge);

        System.out.println(refridgerator.showMeatinFridge());
        System.out.println(refridgerator.showVegetableinFridge());
        System.out.println( refridgerator.showDrinksinFridge());





    }
}
