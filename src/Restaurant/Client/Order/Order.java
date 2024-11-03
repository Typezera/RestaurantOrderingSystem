package Restaurant.Client.Order;

import Restaurant.Client.Order.Dish.Dish;

import java.util.ArrayList;
import java.util.List;

public class Order
{
    private List<Dish> _dish;
    private double _totalValue;

    public Order(){
        _dish = new ArrayList<>();
    }

    public void addDishToOrder(Dish dish){
        _dish.add(dish);
        _totalValue += dish.getPrice();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order details: \n");
        for(Dish dish : _dish){
            sb.append(dish.getName()).append(" - $").append(dish.getPrice()).append("\n");
        }
        sb.append("Total Value: $").append(_totalValue);
        return sb.toString();
    }
}
