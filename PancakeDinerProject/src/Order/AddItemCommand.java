package Order;

import Pancake.Pancake;

public class AddItemCommand implements OrderCommand{
    private Order order;
    private Pancake pancake;

    public AddItemCommand(Pancake pancakes, Order order){
        this.pancake = pancakes;
        this.order =order;
    }

    @Override
    public void execute() {
       this.order.addPancake(pancake);
    }
}
