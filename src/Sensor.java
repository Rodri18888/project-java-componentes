public class Sensor {
    private String tipo;
    private double valor;
    private String unidad;

    // Constructor
    public Sensor(String tipo, double valor, String unidad) {
        this.tipo = tipo;
        this.valor = valor;
        this.unidad = unidad;
    }

    // Metodo
    public void mostrarInfo() {
        System.out.println("Informacion del sensor");
        System.out.println("tipo: " + tipo);
        System.out.println("valor: " + valor + " " + unidad);
    }
}
