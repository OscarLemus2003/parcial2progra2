package P2.Pizza.Especialidades;

import P2.Pizza.Base.Pizza;
import P2.Pizza.Base.Topping;

public class PizzaMexicana extends Pizza {

    public PizzaMexicana() {
        super();
        this.setName("Pizza Mexicana");
        this.addDefaultIngredients();
    }

    private void addDefaultIngredients() {

        this.addTopping(Topping.CHILI);
        this.addTopping(Topping.ONION);
        this.addTopping(Topping.BEEF);
    }
}