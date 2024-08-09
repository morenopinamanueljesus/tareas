package com.prueba.tareas.domain.service;

import com.prueba.tareas.application.dto.TareaResponse;
import com.prueba.tareas.application.dto.TareaRequest;

import java.util.List;

/**
 * The interface Tarea service.
 */
public interface TareaService {
    /**
     * Create tarea tarea response.
     *
     * @param tarea the tarea
     * @return the tarea response
     */
    TareaResponse createTarea(TareaRequest tarea);

    /**
     * Gets all tareas.
     *
     * @return the all tareas
     */
    List<TareaResponse> getAllTareas();
}
