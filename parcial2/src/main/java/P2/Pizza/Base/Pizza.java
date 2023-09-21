package P2.Pizza.Base;
import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    private String name;
    private String size;
    private List<Topping> toppings;
    private double basePrice;
    private List<String> preparationSteps = new ArrayList<>();
    public Pizza() {
        this.toppings = new ArrayList<>();
        this.basePrice = 8.0; // Precio base de la pizza
        
    }

    public List<String> getPreparationSteps() {
        return preparationSteps;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void removeTopping(Topping topping) {
        toppings.remove(topping);
    }

    public double calculatePrice() {
        double total = basePrice;

        // Agregar el costo de los ingredientes
        for (Topping topping : toppings) {
            total += topping.getPrice();
        }

        // Aplicar descuento según el tamaño de la pizza (personaliza esta lógica)
        if ("Pequeña".equals(size)) {
            total *= 0.9; // Ejemplo: descuento del 10% para pizzas pequeñas
        } else if ("Mediana".equals(size)) {
            total *= 1.0; // El precio no cambia para pizzas medianas
        } else if ("Grande".equals(size)) {
            total *= 1.2; // Ejemplo: recargo del 20% para pizzas grandes
        }

        return total;
    }

    public void prepare() {
        getPreparationSteps().add("Preparando pizza: " + name);
        getPreparationSteps().add("Agregando toppings: ");
        for (Topping topping : toppings) {
            getPreparationSteps().add(topping.toString());
        }
    }
// public void prepare() {
//
//         System.out.println("Pizza preparada: " + name);
//         System.out.println("Ingredientes: " + toppings);
//         System.out.println("Tamaño: " + size);
//         // Aquí puedes agregar lógica adicional para preparar la pizza si es necesario
//     }
//
//    @Override
//    public String toString() {
//        return name + " " + size + " " + toppings;
//    }
}
//import java.util.ArrayList;
//import java.util.List;
//
//public class Pizza {
//    private String nombre;
//    private List<Topping> toppings = new ArrayList<>();
//    public Pizza(){
//        this.nombre = nombre;
//        for (Topping topping : toppings) {
//            this.toppings.add(topping);
//        }
//    }
//    public void addTopping(Topping topping){
//        this.toppings.add(topping);
//    }
//    @Override
//    public String toString(){
////        return nombre + " " + toppings;
//        String result = nombre + " ";
//        for (Topping topping : toppings) {
//            result += topping + " ";
//        }
//        return result;
//    }
//public void prepare(){
//    System.out.println("Preparando pizza: " + nombre);
//    System.out.println("Agregando toppings: ");
//  //  Collections.sort(toppings);
//    for (Topping topping : toppings) {
//        System.out.println(topping);
//    }
//    System.out.println("Pizza preparada");
//}
//    public String getNombre() {
//        return nombre;
//    }
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public double calcularPrecio() {
//        double total = 0;
//        for (Topping topping : toppings) {
//            total += topping.getPrecio();
//        }
//        return total;
//    }
//
//    public void quitarTopping(Topping toppingSeleccionado) {
//        this.toppings.remove(toppingSeleccionado);
//    }
//
//    public void setTamaño(String tamañoPizza) {
//
//    }
//
//    public void preparar() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void agregarTopping(Topping toppingSeleccionado) {
//        this.toppings.add(toppingSeleccionado);
//    }
//}
