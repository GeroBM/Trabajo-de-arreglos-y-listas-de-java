public class Pizza {

    private String nombre; // El nombre de la pizza
    private String[] ingredientes; // Lista de  ingredientes

    // Constructor: crea una pizza con un nombre y sin ingredientes
    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = new String[ingredientes.length];
        for (int i = 0; i < ingredientes.length; i++) {
            this.ingredientes[i] = ingredientes[i];
        }
    }

    // Devuelve el nombre de la pizza
    public String getNombre() {
        return nombre;
    }

    // Devuelve la lista de ingredientes de la pizza
    public String[] getIngredientes() {
        return ingredientes;
    }
}
