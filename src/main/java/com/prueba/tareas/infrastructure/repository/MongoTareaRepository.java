package com.prueba.tareas.infrastructure.repository;

import com.prueba.tareas.domain.model.TareaEntity;
import com.prueba.tareas.domain.repository.TareaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Mongo tarea repository.
 */
@Repository
public interface MongoTareaRepository extends MongoRepository<TareaEntity, String>, TareaRepository {
}
