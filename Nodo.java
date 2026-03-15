public class Nodo {

    Pizza pedido;// Pedido de la pizza
    Nodo siguiente;// Puntero al nodo de abajo en la pila

    // Constructor
    public Nodo(Pizza pedido) {
        this.pedido = pedido;
        this.siguiente = null;
    }
}