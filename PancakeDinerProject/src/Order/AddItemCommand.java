package Order;

import Pancake.Pancake;

public class AddItemCommand implements OrderCommand{
    private Order order;
    private Pancake pancake;

    public AddItemCommand(Pancake pancakes, Order order){
        this.pancake = pancakes;
        this.order =order;
    }
//
//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
//
//    public Pancake getItem() {
//        return pancakes;
//    }
//
//    public void setItem(Pancake item) {
//        this.pancakes = pancakes;
//    }

    @Override
    public void execute() {
       this.order.addPancake(pancake);
    }
}
