package Restaurant.Client.Order.Dish;

import java.util.ArrayList;
import java.util.List;

public class Dish
{
    public String name;
    public double price;
    public List<String> ingredients;

    public Dish(String name, double price){
        this.name = name;
        this.price = price;
        ingredients = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public void addIngredient(String ingredient){
        ingredients.add(ingredient);
    }

    public void getIngredients()
    {
        for (String ingredient : ingredients){
            System.out.println(ingredient);
        }
    }
}
