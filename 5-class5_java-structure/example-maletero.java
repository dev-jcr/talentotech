//Características de la POO:
// Abstracción, encapsulamiento y dos más.
// Herencia permite crear nuevas clases basadas en clases existentes.

// Clase padre
class Vehiculo {
String marca;
String modelo;
int año;
int 

  public void acelerar() {
    System.out.println("El vehículo esta frenando");
  }
  public void frenar() {
    System.out.println("El vehículo esta frenando");
  }
}

// Clase hija
class Vehiculo extends Vehiculo {
  int numeroPuertas;
  public void abrirMaletero() {
    System.out.println("Maletero abierto");
  }
}

// Uso
public class Main {
  public static void main(String[] args) {
    Vehiculo miVehiculo = new Vehiculo();
    miVehiculo.marca = "Toyota"; // Heredado de Vehiculo
    miVehiculo.modelo = "Corolla"; // Heredado de Vehiculo
    miVehiculo.numeroPuertas = 4;  // Propio de Vehiculo
    miVehiculo.acelerar(); // Heredado de Vehiculo
    miVehiculo.abrirMaletero();  // Heredado de Vehiculo
  }
}

// lamartinez@sena.edu.co