package com.example.demo.service;
import com.example.demo.model.Chiste;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Servicio con almacenamiento EN MEMORIA (sin BD).
 * Usa un ConcurrentHashMap<Long, Chiste> para guardar los chistes
 * y un contador AtomicLong para generar IDs únicos.
 *
 * Nota: los datos se pierden cuando reinicias la aplicación.
 */
@Service
public class ChisteService {

    /** Almacén en memoria: id -> chiste. Thread-safe para accesos concurrentes. */
    private final ConcurrentHashMap<Long, Chiste> store = new ConcurrentHashMap<>();

    /** Secuencia de IDs autoincremental en memoria. */
    private final AtomicLong seq = new AtomicLong(0);

    /** Generador de aleatorios para el endpoint "random". */
    private final Random random = new Random();

    /** Constructor: si el almacén está vacío, sembramos algunos chistes. */
    public ChisteService() {
        if (store.isEmpty()) {
            create(new Chiste(null, "¿Qué le dice un 0 a un 8? Bonito cinturón."));
            create(new Chiste(null, "¿Qué hace una abeja en el gimnasio? ¡Zum-ba!"));
            create(new Chiste(null, "¿Pez? ¡Nada!"));
        }
    }

    /**
     * Devuelve una lista inmutable con todos los chistes.
     * @return lista de chistes
     */
    public List<Chiste> findAll() {
        return Collections.unmodifiableList(new ArrayList<>(store.values()));
    }

    /**
     * Busca un chiste por su id.
     * @param id identificador del chiste
     * @return Optional con el chiste si existe
     */
    public Optional<Chiste> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    /**
     * Crea un chiste nuevo: asigna un id secuencial y lo guarda en memoria.
     * @param chiste objeto con el texto (id puede ser null)
     * @return chiste guardado con id asignado
     */
    public Chiste create(Chiste chiste) {
        long id = seq.incrementAndGet();        // genera un id único
        chiste.setId(id);                       // asigna el id al objeto
        store.put(id, chiste);                  // guarda en el almacén
        return chiste;                          // retorna el creado
    }

    /**
     * Actualiza un chiste existente, reemplazando su texto.
     * @param id id del chiste a modificar
     * @param nuevo datos entrantes (solo se usa el texto)
     * @return Optional con el chiste actualizado si existía
     */
    public Optional<Chiste> update(Long id, Chiste nuevo) {
        return Optional.ofNullable(store.computeIfPresent(id, (k, existente) -> {
            existente.setTexto(nuevo.getTexto());
            return existente;
        }));
    }

    /**
     * Elimina un chiste por id.
     * @param id identificador del chiste
     * @return true si existía y fue eliminado
     */
    public boolean delete(Long id) {
        return store.remove(id) != null;
    }

    /**
     * Devuelve un chiste aleatorio o null si está vacío.
     */
    public Chiste random() {
        List<Chiste> todos = new ArrayList<>(store.values());
        if (todos.isEmpty()) return null;
        return todos.get(random.nextInt(todos.size()));
    }
}