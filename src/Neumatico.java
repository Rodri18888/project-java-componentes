public class Neumatico {
    private String marca;
    private int tamano;
    private double presion;

    // Constructor
    public Neumatico(String marca, int tamano, double presion) {
        this.marca = marca;
        this.tamano = tamano;
        this.presion = presion;
    }

    // Metodo
    public void mostrarInfo() {
        System.out.println("Informacion del neumatico");
        System.out.println("marca: " + marca);
        System.out.println("tamano: " + tamano + " pulgadas");
        System.out.println("presion: " + presion + " PSI");
    }
}
