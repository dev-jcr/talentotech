package com.example.demo.model;

/**
 * Modelo simple para representar un chiste.
 * No es una entidad JPA: no hay anotaciones @Entity, @Id, etc.,
 * porque no usaremos base de datos. Solo un POJO con dos campos:
 * id (Long) y texto (String).
 */
public class Chiste {

    /** Identificador único del chiste (se genera en memoria). */
    private Long id;

    /** Texto del chiste. */
    private String texto;

    /** Constructor vacío, útil para (de)serialización JSON. */
    public Chiste() {}

    /** Constructor de conveniencia. */
    public Chiste(Long id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    // --- Getters y Setters ---

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTexto() { return texto; }

    public void setTexto(String texto) { this.texto = texto; }
}

