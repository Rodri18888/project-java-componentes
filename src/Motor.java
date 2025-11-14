// Crear clase
public class Motor {
    private String tipo;
    private int cilindrada;
    private double potencia;

    // Constructor
    public Motor(String tipo, int cilindrada, double potencia) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    // Metodo
    public void mostrarInfo() {
        System.out.println("Informacion del motor");
        System.out.println("tipo: " + tipo);
        System.out.println("cilindrada: " + cilindrada + "L");
        System.out.println("potencia: " + potencia + "kw");
    }
}