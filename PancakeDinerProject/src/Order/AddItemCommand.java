package Order;

import Pancake.Pancake;

public class AddItemCommand implements OrderCommand {
    private Order order;
    private Pancake pancake;

    public AddItemCommand(Pancake pancake, Order order) {
        this.pancake = pancake;
        this.order = order;
    }

    @Override
    public void execute() {
        order.addPancake(pancake);
    }
}
