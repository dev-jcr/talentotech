// Uso
public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.marca = "Toyota";        // Heredado de Vehiculo
        miVehiculo.modelo = "Corolla";      // Heredado de Vehiculo
        miVehiculo.numeroPuertas = 4;       // Propio de Vehiculo
        miVehiculo.acelerar();              // Heredado de Vehiculo
        miVehiculo.abrirMaletero();         // Propio de Vehiculo
    }
}
