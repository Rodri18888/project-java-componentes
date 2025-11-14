public class Chasis {
    private String tipo;
    private String dimensiones;
    private double peso;

    // Constructor
    public Chasis(String tipo, String dimensiones, double peso) {
        this.tipo = tipo;
        this.dimensiones = dimensiones;
        this.peso = peso;
    }

    // Metodo
    public void mostrarInfo() {
        System.out.println("Informacion del chasis");
        System.out.println("tipo: " + tipo);
        System.out.println("dimensiones: " + dimensiones);
        System.out.println("peso: " + peso + " kg");
    }
}
