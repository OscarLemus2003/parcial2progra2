package P2.Pizza.Especialidades;

import P2.Pizza.Base.Pizza;
import P2.Pizza.Base.Topping;

public class PizzaVegetariana extends Pizza {
    public PizzaVegetariana() {
        super();
        this.setName("Pizza Vegetariana");
        this.addDefaultIngredients();
    }

    private void addDefaultIngredients() {
        this.addTopping(Topping.MUSHROOM);
        this.addTopping(Topping.CHILI);
        this.addTopping(Topping.ONION);
    }
}
//        private String name;
//        private String ingredients;
//
//        public String getName() {
//            return name;
//        }
//
//        public String getIngredients() {
//            return ingredients;
//        }
//
//        public PizzaVegetariana() {
//            super();
//            this.name = "Pizza Vegetariana";
//            this.ingredients = "Champiñones, Queso, Cebolla";
//        }
//}
