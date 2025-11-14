public class Mantenimiento {
    private String historial;
    private String proximoServicio;
    private String tipoServicio;

    // Constructor
    public Mantenimiento(String historial, String proximoServicio, String tipoServicio) {
        this.historial = historial;
        this.proximoServicio = proximoServicio;
        this.tipoServicio = tipoServicio;
    }

    // Metodo
    public void mostrarInfo() {
        System.out.println("Informacion de mantenimiento");
        System.out.println("historial: " + historial);
        System.out.println("proximo servicio: " + proximoServicio);
        System.out.println("tipo de servicio: " + tipoServicio);
    }
}
