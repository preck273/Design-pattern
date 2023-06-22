package Order;

import Pancake.Pancake;

public class RemoveItemCommand implements OrderCommand {
    private Order order;
    private Pancake pancake;

    public RemoveItemCommand(Pancake pancake, Order order) {
        this.pancake = pancake;
        this.order = order;
    }

    @Override
    public void execute() {
        order.removePancake(pancake);
    }
}

