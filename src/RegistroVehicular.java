public class RegistroVehicular {
    private String matricula;
    private String propietario;
    private String fechaRegistro;

    // Constructor
    public RegistroVehicular(String matricula, String propietario, String fechaRegistro) {
        this.matricula = matricula;
        this.propietario = propietario;
        this.fechaRegistro = fechaRegistro;
    }

    // Metodo
    public void mostrarInfo() {
        System.out.println("Informacion del registro vehicular");
        System.out.println("matricula: " + matricula);
        System.out.println("propietario: " + propietario);
        System.out.println("fecha de registro: " + fechaRegistro);
    }
}
