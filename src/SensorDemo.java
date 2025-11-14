public class SensorDemo {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor("Temperatura", 88.5, "°C");
        sensor1.mostrarInfo();

        Sensor sensor2 = new Sensor("Presion", 32.0, "PSI");
        sensor2.mostrarInfo();
    }
}
