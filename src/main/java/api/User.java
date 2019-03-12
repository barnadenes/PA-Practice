package api;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int calories;
    private List<Food> items;

    public User(String name, int calories) {
        this.name = name;
        this.calories = calories;
        this.items = new ArrayList<Food>();
    }

    

}
