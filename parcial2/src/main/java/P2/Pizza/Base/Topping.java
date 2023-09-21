package P2.Pizza.Base;

import java.util.ArrayList;
import java.util.List;

public class Topping {
    public static final Topping TOMATO = new Topping("Tomato", 2.0);
    public static final Topping MOZZARELLA = new Topping("Mozzarella", 1.5);
    public static final Topping BASIL = new Topping("Basil", 1.0);
    public static final Topping PINEAPPLE = new Topping("Pineapple", 2.0);
    public static final Topping HAM = new Topping("Ham", 2.5);
    public static final Topping CHILI = new Topping("Chili", 2.0);
    public static final Topping BEEF = new Topping("Beef", 3.0);
    public static final Topping MUSHROOM = new Topping("Mushroom", 1.8);
    public static final Topping ONION = new Topping("Onion", 1.2);

    public static final List<Topping> INGREDIENTES_DISPONIBLES = List.of(
            TOMATO, MOZZARELLA, BASIL, PINEAPPLE, HAM, CHILI, BEEF, MUSHROOM, ONION);



    private String name;
    private double price;

    private Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }}

//    private String nombre; // Nombre del topping
//    private double precio;
//    private ArrayList<String> ingredientes = new ArrayList<>(); // Ingredientes del topping
//    //public void agregarIngrediente(String ingrediente) {
//     //   this.ingredientes.add(ingrediente);
//  //  }
//   public Topping(String nombre, double precio) {
//
//        this.nombre = nombre;
//        this.precio = precio;
//    }
//
//    public static Topping[] getIngredientesDisponibles() {
//        return new Topping[0];
//    }
//
//    @Override
//    public String toString() {
//        return nombre + "  Q" + precio;
//    }
//    //sumar precio
//    //getters y setters
//    public String getNombre() {
//        return nombre;
//    }
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//    public ArrayList<String> getIngredientes() {
//        return ingredientes;
//    }
//    public void setIngredientes(ArrayList<String> ingredientes) {
//        this.ingredientes = ingredientes;
//    }
//    public double getPrecio() {
//        return precio;
//    }
//}
