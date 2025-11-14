public class TransmisionDemo {
    public static void main(String[] args) {

        Transmision TransmisionT1 = new Transmision("Automatica", 6, "4x4");
        TransmisionT1.mostrarInfo();

        Transmision TransmisionT2 = new Transmision("Manual", 5, "Delantera");
        TransmisionT2.mostrarInfo();

    }
}
