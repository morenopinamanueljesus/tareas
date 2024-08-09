package com.prueba.tareas.infrastructure.dao;

import com.prueba.tareas.application.dto.TareaResponse;
import com.prueba.tareas.application.dto.TareaRequest;

import java.util.List;

/**
 * The interface Tarea dao.
 */
public interface TareaDao {
    /**
     * Save tarea response.
     *
     * @param tarea the tarea
     * @return the tarea response
     */
    TareaResponse save(TareaRequest tarea);

    /**
     * Find all list.
     *
     * @return the list
     */
    List<TareaResponse> findAll();
}
