public class SistemaFrenos {
    private String tipo;
    private int discos;
    private boolean abs;
    private String estado;

    // Constructor
    public SistemaFrenos(String tipo, int discos, boolean abs, String estado) {
        this.tipo = tipo;
        this.discos = discos;
        this.abs = abs;
        this.estado = estado;
    }

    // Metodo
    public void mostrarInfo() {
        System.out.println("Informacion del sistema de frenos");
        System.out.println("tipo: " + tipo);
        System.out.println("discos: " + discos);
        System.out.println("ABS: " + (abs ? "Sí" : "No"));
        System.out.println("estado: " + estado);
    }
}
