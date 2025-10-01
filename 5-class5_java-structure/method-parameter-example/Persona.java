// Un método puede recibir parámetros (datos de entrada) para ejecutar una acción específica. Se declaran dentro de los paréntesis del método. Ejemplo:



class Persona {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    void saludar(String mensaje) {
        System.out.println(mensaje + ", soy " + nombre + " y tengo " + edad + " años.");
    }
}


