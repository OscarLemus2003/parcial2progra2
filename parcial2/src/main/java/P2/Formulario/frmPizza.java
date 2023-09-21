package P2.Formulario;

//iimport P2.Pizza.Base.Pizza;
//import P2.Pizza.Base.Topping;
//import P2.Pizza.Especialidades.*;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.util.ArrayList;
//import java.util.List;
//
//public class frmPizza {
//    private JPanel jPanelPrincipal;
//    private JComboBox<Pizza> comboBoxPizza;
//    private JList<Topping> listaIngredientes;
//    private JList<String> listaPreparacion;
//    private JTextField txtPizzaNombre;
//    private JRadioButton radioPequena;
//    private JRadioButton radioMediana;
//    private JRadioButton radioGrande;
//    private JButton btnAgregarIngrediente;
//    private JButton btnQuitarIngrediente;
//    private JButton btnPrepararPizza;
//    private JLabel lblTotal;
//    private double total = 0;
//    private Pizza pizzaSeleccionada;
//
//    public frmPizza() {
//        cargarPizzas();
//        cargarIngredientes();
//        btnAgregarIngrediente.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Topping toppingSeleccionado = listaIngredientes.getSelectedValue();
//                if (toppingSeleccionado != null && pizzaSeleccionada != null) {
//                    pizzaSeleccionada.addTopping(toppingSeleccionado);
//                    actualizarTotal();
//                }
//            }
//        });
//
//        btnQuitarIngrediente.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Topping toppingSeleccionado = listaIngredientes.getSelectedValue();
//                if (toppingSeleccionado != null && pizzaSeleccionada != null) {
//                    pizzaSeleccionada.removeTopping(toppingSeleccionado);
//                    actualizarTotal();
//                }
//            }
//        });
//
//        btnPrepararPizza.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String nombrePizza = txtPizzaNombre.getText().trim();
//                String tamañoPizza = obtenerTamañoSeleccionado();
//                if (!nombrePizza.isEmpty() && pizzaSeleccionada != null && tamañoPizza != null) {
//                    pizzaSeleccionada.setSize(tamañoPizza);
//                    pizzaSeleccionada.setName(nombrePizza);
//                    prepararPizza();
//                } else {
//                    JOptionPane.showMessageDialog(null, "Completa todos los campos antes de preparar la pizza.");
//                }
//            }
//        });
//
//        listaIngredientes.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if (e.getClickCount() == 2) {
//                    Topping toppingSeleccionado = listaIngredientes.getSelectedValue();
//                    if (toppingSeleccionado != null) {
//                        pizzaSeleccionada.removeTopping(toppingSeleccionado);
//                        actualizarTotal();
//                    }
//                }
//            }
//        });
//    }
//
//    private void cargarPizzas() {
//        List<Pizza> pizzas = new ArrayList<>();
//        pizzas.add(new PizzaYolaArmo());
//        pizzas.add(new PizzaHawaiana());
//        pizzas.add(new PizzaMexicana());
//        pizzas.add(new PizzaVegetariana());
//
//        comboBoxPizza.setModel(new DefaultComboBoxModel<>(pizzas.toArray(new Pizza[0])));
//
//        comboBoxPizza.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                pizzaSeleccionada = (Pizza) comboBoxPizza.getSelectedItem();
//                if (pizzaSeleccionada != null) {
//                    cargarIngredientes();
//                    actualizarTotal();
//                }
//            }
//        });
//    }
//
//    private void cargarIngredientes() {
//        DefaultListModel<Topping> model = new DefaultListModel<>();
//
//        if (pizzaSeleccionada != null) {
//            List<Topping> ingredientesDisponibles = pizzaSeleccionada.getDefaultToppings();
//            for (Topping topping : ingredientesDisponibles) {
//                model.addElement(topping);
//            }
//        }
//
//        listaIngredientes.setModel(model);
//    }
//
//    private void actualizarTotal() {
//        if (pizzaSeleccionada != null) {
//            double precio = pizzaSeleccionada.calculatePrice();
//            lblTotal.setText(String.valueOf(precio));
//        }
//    }
//
//    private String obtenerTamañoSeleccionado() {
//        if (radioPequena.isSelected()) {
//            return "Pequeña";
//        } else if (radioMediana.isSelected()) {
//            return "Mediana";
//        } else if (radioGrande.isSelected()) {
//            return "Grande";
//        } else {
//            return null;
//        }
//    }
//
//    private void prepararPizza() {
//        DefaultListModel<String> preparacionModel = new DefaultListModel<>();
//        pizzaSeleccionada.prepare();
//        preparacionModel.addElement("Pizza preparada: " + pizzaSeleccionada.getName());
//
//        for (String paso : pizzaSeleccionada.getPreparationSteps()) {
//            preparacionModel.addElement(paso);
//        }
//
//        listaPreparacion.setModel(preparacionModel);
//
//        total = pizzaSeleccionada.calculatePrice();
//        lblTotal.setText(String.valueOf(total));
//
//        JOptionPane.showMessageDialog(null, "Pizza preparada: " + pizzaSeleccionada.getName() + " Total: " + total);
//    }
//
//    public JPanel getjPanelPrincipal() {
//        return jPanelPrincipal;
//    }
//
//import P2.Pizza.Base.Pizza;
//import P2.Pizza.Base.Topping;
//import P2.Pizza.Especialidades.PizzaHawaiana;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.util.ArrayList;
//import java.util.List;
//
//public class frmPizza {
//    private JPanel jPanelPrincipal;
//    private JComboBox<String> comboBoxPizza;
//    private JList<Topping> listaIngredientes;
//    private JList<String> listaPreparacion;
//    private JTextField txtPizzaNombre;
//    private JRadioButton radioPequena;
//    private JRadioButton radioMediana;
//    private JRadioButton radioGrande;
//    private JButton btnAgregarIngrediente;
//    private JButton btnQuitarIngrediente;
//    private JButton btnPrepararPizza;
//    private JLabel lblTotal;
//    private double total = 0;
//    private Pizza pizzaSeleccionada;
//
//    public frmPizza() {
//        cargarPizzas();
//        cargarIngredientes();
//        btnAgregarIngrediente.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Topping toppingSeleccionado = listaIngredientes.getSelectedValue();
//                if (toppingSeleccionado != null && pizzaSeleccionada != null) {
//                    pizzaSeleccionada.addTopping(toppingSeleccionado);
//                    actualizarTotal();
//                }
//            }
//        });
//
//        btnQuitarIngrediente.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Topping toppingSeleccionado = listaIngredientes.getSelectedValue();
//                if (toppingSeleccionado != null && pizzaSeleccionada != null) {
//                    pizzaSeleccionada.removeTopping(toppingSeleccionado);
//                    actualizarTotal();
//                }
//            }
//        });
//
//        btnPrepararPizza.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String nombrePizza = txtPizzaNombre.getText().trim();
//                String tamañoPizza = obtenerTamañoSeleccionado();
//                if (!nombrePizza.isEmpty() && pizzaSeleccionada != null && tamañoPizza != null) {
//                    pizzaSeleccionada.setSize(tamañoPizza);
//                    pizzaSeleccionada.setName(nombrePizza);
//                    prepararPizza();
//                } else {
//                    JOptionPane.showMessageDialog(null, "Completa todos los campos antes de preparar la pizza.");
//                }
//            }
//        });
//
//        listaIngredientes.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if (e.getClickCount() == 2) {
//                    Topping toppingSeleccionado = listaIngredientes.getSelectedValue();
//                    if (toppingSeleccionado != null) {
//                        pizzaSeleccionada.removeTopping(toppingSeleccionado);
//                        actualizarTotal();
//                    }
//                }
//            }
//        });
//    }
//
//    private void cargarPizzas() {
//        List<String> pizzas = new ArrayList<>();
//        pizzas.add("Pizza Hawaiana");
//        pizzas.add("Otra pizza"); // Agrega otras opciones de pizza aquí
//
//        comboBoxPizza.setModel(new DefaultComboBoxModel<>(pizzas.toArray(new String[0])));
//
//        comboBoxPizza.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String pizzaSeleccionadaStr = (String) comboBoxPizza.getSelectedItem();
//                if (pizzaSeleccionadaStr != null) {
//                    pizzaSeleccionada = crearPizza(pizzaSeleccionadaStr);
//                    cargarIngredientes();
//                    actualizarTotal();
//                }
//            }
//        });
//    }
//
//    private Pizza crearPizza(String nombrePizza) {
//        if ("Pizza Hawaiana".equals(nombrePizza)) {
//            return new PizzaHawaiana();
//        } else if ("Otra pizza".equals(nombrePizza)) {
//            // Crea y devuelve otra clase de pizza aquí si es necesario
//        }
//
//        return null;
//    }
//
//    private void cargarIngredientes() {
//        DefaultListModel<Topping> model = new DefaultListModel<>();
//
//        if (pizzaSeleccionada != null) {
//            List<Topping> ingredientesDisponibles = Topping.INGREDIENTES_DISPONIBLES;
//            for (Topping topping : ingredientesDisponibles) {
//                model.addElement(topping);
//            }
//        }
//
//        listaIngredientes.setModel(model);
//    }
//
//    private void actualizarTotal() {
//        if (pizzaSeleccionada != null) {
//            double precio = pizzaSeleccionada.calculatePrice();
//            lblTotal.setText(String.valueOf(precio));
//        }
//    }
//
//    private String obtenerTamañoSeleccionado() {
//        if (radioPequena.isSelected()) {
//            return "Pequeña";
//        } else if (radioMediana.isSelected()) {
//            return "Mediana";
//        } else if (radioGrande.isSelected()) {
//            return "Grande";
//        } else {
//            return null;
//        }
//    }
//
//    private void prepararPizza() {
//        DefaultListModel<String> preparacionModel = new DefaultListModel<>();
//        pizzaSeleccionada.prepare();
//        preparacionModel.addElement("Pizza preparada: " + pizzaSeleccionada.getName());
//
//        for (String paso : pizzaSeleccionada.getPreparationSteps()) {
//            preparacionModel.addElement(paso);
//        }
//
//        listaPreparacion.setModel(preparacionModel);
//
//        total = pizzaSeleccionada.calculatePrice();
//        lblTotal.setText(String.valueOf(total));
//
//        JOptionPane.showMessageDialog(null, "Pizza preparada: " + pizzaSeleccionada.getName() + " Total: " + total);
//    }
//
//    public JPanel getjPanelPrincipal() {
//        return jPanelPrincipal;
//    }
//}
import P2.Pizza.Base.Pizza;
import P2.Pizza.Base.Topping;
import P2.Pizza.Especialidades.PizzaHawaiana;
import P2.Pizza.Especialidades.PizzaYolaArmo;
import P2.Pizza.Especialidades.PizzaMexicana;
import P2.Pizza.Especialidades.PizzaVegetariana;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class frmPizza {
    private JPanel jPanelPrincipal;
    private JComboBox<String> comboBoxPizza;
    private JList<Topping> listaIngredientes;
    private JList<String> listaPreparacion;
    private JTextField txtPizzaNombre;
    private JRadioButton radioPequena;
    private JRadioButton radioMediana;
    private JRadioButton radioGrande;
    private JButton btnAgregarIngrediente;
    private JButton btnQuitarIngrediente;
    private JButton btnPrepararPizza;
    private JLabel lblTotal;

    private double total = 0;
    private Pizza pizzaSeleccionada;

    public frmPizza() {
        cargarPizzas();
        cargarIngredientes();
        btnAgregarIngrediente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Topping toppingSeleccionado = listaIngredientes.getSelectedValue();
                if (toppingSeleccionado != null && pizzaSeleccionada != null) {
                    pizzaSeleccionada.addTopping(toppingSeleccionado);
                    actualizarTotal();
                }
            }
        });

        btnQuitarIngrediente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Topping toppingSeleccionado = listaIngredientes.getSelectedValue();
                if (toppingSeleccionado != null && pizzaSeleccionada != null) {
                    pizzaSeleccionada.removeTopping(toppingSeleccionado);
                    actualizarTotal();
                }
            }
        });

        btnPrepararPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombrePizza = txtPizzaNombre.getText().trim();
                String tamañoPizza = obtenerTamañoSeleccionado();
                if (!nombrePizza.isEmpty() && pizzaSeleccionada != null && tamañoPizza != null) {
                    pizzaSeleccionada.setSize(tamañoPizza);
                    pizzaSeleccionada.setName(nombrePizza);
                    prepararPizza();
                } else {
                    JOptionPane.showMessageDialog(null, "Completa todos los campos antes de preparar la pizza.");
                }
            }
        });

        listaIngredientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Topping toppingSeleccionado = listaIngredientes.getSelectedValue();
                    if (toppingSeleccionado != null) {
                        pizzaSeleccionada.removeTopping(toppingSeleccionado);
                        actualizarTotal();
                    }
                }
            }
        });
    }

    private void cargarPizzas() {
        List<String> pizzas = new ArrayList<>();
        pizzas.add("Pizza Yola Armo");
        pizzas.add("Pizza Hawaiana");
        pizzas.add("Pizza Mexicana");
        pizzas.add("Pizza Vegetariana");

        pizzas.add("Otra pizza"); // Agrega otras opciones de pizza aquí

        comboBoxPizza.setModel(new DefaultComboBoxModel<>(pizzas.toArray(new String[0])));

        comboBoxPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pizzaSeleccionadaStr = (String) comboBoxPizza.getSelectedItem();
                if (pizzaSeleccionadaStr != null) {
                    pizzaSeleccionada = crearPizza(pizzaSeleccionadaStr);
                    cargarIngredientes();
                    actualizarTotal();
                }
            }
        });
    }

    private Pizza crearPizza(String nombrePizza) {
        if ("Pizza Hawaiana".equals(nombrePizza)) {
            return new PizzaHawaiana();
        } else if ("Pizza Mexicana".equals(nombrePizza)) {
            return new PizzaMexicana();
        } else if ("Pizza Vegetariana".equals(nombrePizza)) {
            return new PizzaVegetariana();
        } else if ("Pizza Yola Armo".equals(nombrePizza)) {
            return new PizzaYolaArmo();
            // Crea y devuelve otra clase de pizza aquí si es necesario
        }

        return null;
    }

    private void cargarIngredientes() {
        DefaultListModel<Topping> model = new DefaultListModel<>();

        if (pizzaSeleccionada != null) {
            List<Topping> ingredientesDisponibles = Topping.INGREDIENTES_DISPONIBLES;
            for (Topping topping : ingredientesDisponibles) {
                model.addElement(topping);
            }
        }

        listaIngredientes.setModel(model);
    }

    private void actualizarTotal() {
        if (pizzaSeleccionada != null) {
            double precio = pizzaSeleccionada.calculatePrice();
            lblTotal.setText(String.valueOf(precio));
        }
    }

    private String obtenerTamañoSeleccionado() {
        if (radioPequena.isSelected()) {
            return "Pequeña";
        } else if (radioMediana.isSelected()) {
            return "Mediana";
        } else if (radioGrande.isSelected()) {
            return "Grande";
        } else {
            return null;
        }
    }

    private void prepararPizza() {
        DefaultListModel<String> preparacionModel = new DefaultListModel<>();
        pizzaSeleccionada.prepare();
        preparacionModel.addElement("Pizza preparada: " + pizzaSeleccionada.getName());

        for (String paso : pizzaSeleccionada.getPreparationSteps()) {
            preparacionModel.addElement(paso);
        }

        listaPreparacion.setModel(preparacionModel);

        total = pizzaSeleccionada.calculatePrice();
        lblTotal.setText(String.valueOf(total));

        JOptionPane.showMessageDialog(null, "Pizza preparada: " + pizzaSeleccionada.getName()+ " Total: " + total);
    }

    public JPanel getjPanelPrincipal() {
        return jPanelPrincipal;
    }
}

