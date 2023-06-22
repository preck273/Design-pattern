package Order;

import Pancake.Pancake;

public class UpdateItemCommand implements OrderCommand {
    private Order order;
    private Pancake pancake;
    private int quantity;

    public UpdateItemCommand(Pancake pancake, int quantity, Order order) {
        this.pancake = pancake;
        this.quantity = quantity;
        this.order = order;
    }

    @Override
    public void execute() {
        order.updatePancake(pancake, quantity);
    }
}

