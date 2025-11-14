public class MotorDemo {
    public static void main(String[] args) {

        Motor motor1 = new Motor("Electrico", 2000, 2.20);
        motor1.mostrarInfo();

        Motor motor2 = new Motor("Diesel", 1500, 0.30);
        motor2.mostrarInfo();

    }
}
