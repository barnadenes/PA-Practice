package cmd;

import api.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        XmlLoader xml = new XmlLoader();
        List<Food> fridge = new ArrayList<Food>();

        fridge.addAll(xml.getMeat());
        fridge.addAll(xml.getVegetable());
        fridge.addAll(xml.getDrinks());


        Refridgerator refridgerator = new Refridgerator(fridge);

        System.out.println(refridgerator.showMeatinFridge());
        System.out.println(refridgerator.showVegetableinFridge());
        System.out.println( refridgerator.showDrinksinFridge());

        System.out.println(xml.getMeat());
        System.out.println(xml.getVegetable());
        System.out.println(xml.getDrinks());





    }
}
