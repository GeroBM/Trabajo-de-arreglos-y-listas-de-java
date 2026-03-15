public class Pila {

    private Nodo tope;// Puntero al nodo que está en la cima de la pila
    private int cantidad;// Cantidad de elementos en la pila

    public Pila() {
        this.tope = null;
        this.cantidad = 0;
    }

    // push(): Coloca un nuevo elemento en la cima de la pila
    public void push(Pizza dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;// El nuevo nodo apunta al tope actual
        tope = nuevo;
        cantidad++;
    }

    // pop(): Retira y devuelve el elemento de la cima
    public Pizza pop() {
        if (isEmpty()) {
            System.out.println("No hay pedidos, no hay nada que retirar.");
            return null;
        }
        Pizza datoRetirado = tope.pedido;// Se guarda el dato antes de eliminarlo
        tope = tope.siguiente;
        cantidad--;
        return datoRetirado;
    }

    // peek(): Muestra el elemento de la cima sin retirarlo
    public void peek() {
        if (isEmpty()) {
            System.out.println("No hay pedidos, no hay nada que ver.");
            return;
        }
        System.out.println("Pedido en la cima: " + tope.pedido.getNombre());
        System.out.println("Ingredientes: ");
        String[] ingredientes = tope.pedido.getIngredientes();
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println("  - " + ingredientes[i]);
        }
    }

    // isEmpty(): Verifica si la pila esta vacia
    public boolean isEmpty() {
        return tope == null;
    }
}
