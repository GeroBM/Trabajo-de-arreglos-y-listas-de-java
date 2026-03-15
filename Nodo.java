public class Nodo {

    String pedido;// Pedido de la pizza
    Nodo siguiente;// Puntero al nodo de abajo en la pila

    // Constructor
    public Nodo(String pedido) {
        this.pedido = pedido;
        this.siguiente = null;
    }
}