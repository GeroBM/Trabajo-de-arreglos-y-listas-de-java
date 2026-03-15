public class Pizza {

    // Atributos de la clase Pizza
    private String nombre; // El nombre de la pizza
    private String[] ingredientes; // Lista de  ingredientes

    // Constructor: crea una pizza con un nombre y sin ingredientes
    public Pizza(String nombre) {
        this.nombre = nombre;
        this.ingredientes = new String[3]; // Al inicio, la pizza no tiene ingredientes
    }
}
