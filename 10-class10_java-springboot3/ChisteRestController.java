package pg.ApiRest.controller;

import pg.ApiRest.model.Chiste;
import pg.ApiRest.service.ChisteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

/**
 * Controlador REST con endpoints para gestionar chistes EN MEMORIA.
 *
 * Rutas:
 *  - GET    /api/chistes/todos
 *  - GET    /api/chistes/{id}
 *  - GET    /api/chistes/random
 *  - POST   /api/chistes
 *  - PUT    /api/chistes/{id}
 *  - DELETE /api/chistes/{id}
 */
@RestController
@RequestMapping("/api/chistes")
public class ChisteRestController {

    private final ChisteService service;

    /**
     * Inyección del servicio en el constructor (mejor para test).
     */
    public ChisteRestController(ChisteService service) {
        this.service = service;
    }

    /**
     * Devuelve todos los chistes (200 OK).
     */
    @GetMapping("/todos")
    public List<Chiste> todos() {
        return service.findAll();
    }

    /**
     * Devuelve un chiste por id (200 OK) o 404 si no existe.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Chiste> porId(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)                // 200 OK con el chiste
                .orElse(ResponseEntity.notFound().build()); // 404 Not Found
    }

    /**
     * Devuelve un chiste aleatorio (200 OK) o 204 No Content si no hay datos.
     */
    @GetMapping("/random")
    public ResponseEntity<Chiste> random() {
        Chiste c = service.random();
        return (c == null) ? ResponseEntity.noContent().build()
                           : ResponseEntity.ok(c);
    }

    /**
     * Crea un chiste nuevo (201 Created).
     * Requiere JSON como: { "texto": "..." }
     */
    @PostMapping
    public ResponseEntity<Chiste> crear(@RequestBody Chiste chiste) {
        // Validación muy básica del campo texto
        if (chiste.getTexto() == null || chiste.getTexto().isBlank()) {
            return ResponseEntity.badRequest().build(); // 400 si el texto es inválido
        }
        Chiste creado = service.create(new Chiste(null, chiste.getTexto()));
        // Devuelve 201 con Location apuntando al recurso recién creado
        return ResponseEntity.created(URI.create("/api/chistes/" + creado.getId()))
                             .body(creado);
    }

    /**
     * Actualiza el texto de un chiste existente (200 OK) o 404 si no existe.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Chiste> actualizar(@PathVariable Long id, @RequestBody Chiste chiste) {
        if (chiste.getTexto() == null || chiste.getTexto().isBlank()) {
            return ResponseEntity.badRequest().build();
        }
        return service.update(id, chiste)
                .map(ResponseEntity::ok)                // 200 OK con actualizado
                .orElse(ResponseEntity.notFound().build()); // 404 si no existe
    }

    /**
     * Elimina un chiste por id (204 No Content) o 404 si no existe.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        boolean eliminado = service.delete(id);
        return eliminado ? ResponseEntity.noContent().build()  // 204
                         : ResponseEntity.notFound().build();  // 404
    }
}

