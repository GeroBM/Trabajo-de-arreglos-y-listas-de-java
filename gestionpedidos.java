import java.util.Scanner;

public class gestionpedidos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variables para gestionar los pedidos
        String nombrePizza;
        Pila PedidosPrincipal = new Pila();
        Pila PedidosSecundario = new Pila();
        int opcion;

        // Menú principal
        do {
            System.out.println("\n=== Menú de Gestión de Pedidos ===");
            System.out.println("1. Agregar pedido");
            System.out.println("2. Retirar pedido (undo)");
            System.out.println("3. Recuperar pedido (redo)");
            System.out.println("4. Mostrar pedido actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    // Agregar pedido
                    String[] ingredientes = new String[3];
                    System.out.print("Ingrese el nombre de la pizza: ");
                    nombrePizza = teclado.nextLine();
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Ingrese el ingrediente " + (i + 1) + " para la pizza " + nombrePizza + ": ");
                        ingredientes[i] = teclado.nextLine();
                    }
                    Pizza nuevaPizza = new Pizza(nombrePizza, ingredientes);
                    PedidosPrincipal.push(nuevaPizza);
                    System.out.println("Pedido " + nuevaPizza.getNombre() + " agregado con éxito.");
                    break;
                case 2:
                    // Retirar pedido (undo)
                    if (!PedidosPrincipal.isEmpty()){
                        Pizza pedidoRetirado = PedidosPrincipal.pop();
                        PedidosSecundario.push(pedidoRetirado);
                        System.out.println("Pedido " + pedidoRetirado.getNombre() + " retirado con éxito.");
                    } else {
                        System.out.println("No hay pedidos para retirar.");
                    }
                    break;
                case 3:
                    // Recuperar pedido (redo)
                    if (!PedidosSecundario.isEmpty()){
                        Pizza pedidoRecuperado = PedidosSecundario.pop();
                        PedidosPrincipal.push(pedidoRecuperado);
                        System.out.println("Pedido " + pedidoRecuperado.getNombre() + " recuperado con éxito.");
                    } else {
                        System.out.println("No hay pedidos para recuperar.");
                    }
                    break;
                case 4:
                    // Mostrar pedido actual
                    PedidosPrincipal.peek();
                    break;
                case 0:
                    System.out.println("Saliendo del programa..."); // Se culmina el programa.
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida."); // Salta un error al digitar un numero que no esta en la lista.
            }
        } while (opcion != 0);
        teclado.close();
    }
}
