package Order;

import Pancake.Pancake;

public class RemoveItemCommand implements OrderCommand{

    private Pancake pancake;
    private Order order;

    @Override
    public void execute() {
        this.order.removePancake(pancake);

    }
}
