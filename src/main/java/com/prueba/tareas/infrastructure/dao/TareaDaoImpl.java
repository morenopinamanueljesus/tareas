package com.prueba.tareas.infrastructure.dao;

import com.prueba.tareas.domain.model.TareaEntity;
import com.prueba.tareas.domain.repository.TareaRepository;
import com.prueba.tareas.application.dto.TareaResponse;
import com.prueba.tareas.application.dto.TareaRequest;
import com.prueba.tareas.application.mapper.TareaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The type Tarea dao.
 */
@Repository
public class TareaDaoImpl implements TareaDao{

    /**
     * The Tarea repository.
     */
    @Autowired
    TareaRepository tareaRepository;
    /**
     * The Tarea mapper.
     */
    @Autowired
    TareaMapper tareaMapper;

    @Override
    public TareaResponse save(TareaRequest tarea) {
        TareaEntity entity = tareaMapper.tareaRequestToDto(tarea);
        return tareaMapper.toDto(tareaRepository.save(entity));
    }

    @Override
    public List<TareaResponse> findAll() {
        return tareaMapper.toDto(tareaRepository.findAll());
    }
}
