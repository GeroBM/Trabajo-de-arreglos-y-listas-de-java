public class Pizza {

    // Atributos de la clase Pizza
    private String nombre; // El nombre de la pizza
    private String[] ingredientes; // Lista de  ingredientes

    // Constructor: crea una pizza con un nombre y sin ingredientes
    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }
}
