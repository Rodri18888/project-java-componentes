// Crear clase
public class Vehiculo {
    private int identificador;
    private String marca;
    private String modelo;

    // Constructor
    public Vehiculo(int identificador, String marca, String modelo) {
        this.identificador = identificador;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Metodo
    public void mostrarInfo() {
        System.out.println("Informacion del vehiculo");
        System.out.println("id: " + identificador);
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
    }
}