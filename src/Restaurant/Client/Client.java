package Restaurant.Client;

import Restaurant.Client.Order.Dish.Dish;
import Restaurant.Client.Order.Order;

public class Client
{
    private String _name;
    private Order _order;

    public Client(String name){
        this._name = name;
        this._order = new Order();
    }

    public String getName()
    {
        return _name;
    }
    public Order getOrder()
    {
        return _order;
    }

    public void makeOrder(Dish dish){
        _order.addDishToOrder(dish);
    }
}
