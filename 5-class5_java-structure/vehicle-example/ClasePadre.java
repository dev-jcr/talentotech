// La herencia es un mecanismo fundamental de la Programación Orientada a Objetos (POO) que permite crear nuevas clases basadas en clases existentes. Una clase hija (subclase) hereda atributos y métodos de una clase padre (superclase), permitiendo la reutilización de código y estableciendo relaciones de "es-un".

class ClasePadre {
    // atributos y métodos
}

class ClaseHija extends ClasePadre {
    // atributos y métodos adicionales
    // + los heredados de ClasePadre
}


// Clase Padre
class Vehiculo {
    String marca;
    String modelo;
    int año;
    
    public void acelerar() {
        System.out.println("El vehículo está acelerando");
    }
    
    public void frenar() {
        System.out.println("El vehículo está frenando");
    }
}

// Clase Hija
class Vehiculo extends Vehiculo
    int numeroPuertas;
    
    public void abrirMaletero() {
        System.out.println("Maletero abierto");
    }
}
