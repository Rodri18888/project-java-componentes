// Crear clase
public class Transmision {
    private String tipo;
    private int marchas;
    private String traccion;

    // Constructor
    public Transmision(String tipo, int marchas, String traccion) {
        this.tipo = tipo;
        this.marchas = marchas;
        this.traccion = traccion;
    }

    // Metodo
    public void mostrarInfo() {
        System.out.println("Informacion de la transmision");
        System.out.println("tipo: " + tipo);
        System.out.println("marchas: " + marchas);
        System.out.println("traccion: " + traccion);
    }
}
