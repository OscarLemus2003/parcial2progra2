package P2.Pizza.Especialidades;

import P2.Pizza.Base.Pizza;
import P2.Pizza.Base.Topping;

import java.util.ArrayList;
import java.util.List;

public class PizzaHawaiana extends Pizza {

    public PizzaHawaiana() {
        super();
        this.setName("Pizza Hawaiana");
        this.addDefaultIngredients();
    }

    private void addDefaultIngredients() {
        this.addTopping(Topping.PINEAPPLE);
        this.addTopping(Topping.MOZZARELLA);
        this.addTopping(Topping.HAM);

    }
}