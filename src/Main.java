import Restaurant.Client.Client;
import Restaurant.Client.Order.Dish.Dish;
import Restaurant.Client.Order.Order;

public class Main
{
    public static void main(String[] args){
        Dish dish = new Dish("Macarrão", 19.90);
        dish.addIngredient("Molho de tomate");
        dish.addIngredient("Queijo");
        dish.addIngredient("Macarrão");

        Client person = new Client("Felipe");

        person.makeOrder(dish);

        System.out.println(person.getOrder());
    }
}
