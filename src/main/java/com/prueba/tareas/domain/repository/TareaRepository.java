package com.prueba.tareas.domain.repository;

import com.prueba.tareas.domain.model.TareaEntity;

import java.util.List;

/**
 * The interface Tarea repository.
 */
public interface TareaRepository {
    /**
     * Save tarea entity.
     *
     * @param tarea the tarea
     * @return the tarea entity
     */
    TareaEntity save(TareaEntity tarea);

    /**
     * Find all list.
     *
     * @return the list
     */
    List<TareaEntity> findAll();
}
