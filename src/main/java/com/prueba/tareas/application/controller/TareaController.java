package com.prueba.tareas.application.controller;

import com.prueba.tareas.domain.service.TareaService;
import com.prueba.tareas.application.dto.TareaResponse;
import com.prueba.tareas.application.dto.TareaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Tarea controller.
 */
@RestController
@RequestMapping("/tareas")
public class TareaController {
    /**
     * The Tarea service.
     */
    @Autowired
    TareaService tareaService;

    /**
     * Create tarea response entity.
     *
     * @param request the request
     * @return the response entity
     */
    @PostMapping("/crear")
    public ResponseEntity<TareaResponse> createTarea(@RequestBody TareaRequest request) {
        TareaResponse response = tareaService.createTarea(request);
        return ResponseEntity.ok(response);
    }

    /**
     * Gets all tareas.
     *
     * @return the all tareas
     */
    @GetMapping("/obtener")
    public ResponseEntity<List<TareaResponse>> getAllTareas() {
        List<TareaResponse> response = tareaService.getAllTareas();
        if (response.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(response);
    }
}
