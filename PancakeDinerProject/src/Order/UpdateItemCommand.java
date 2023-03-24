package Order;

import Pancake.Pancake;

public class UpdateItemCommand implements OrderCommand{

    private int quantity;
    private Pancake item;

    @Override
    public void execute() {

    }
}
