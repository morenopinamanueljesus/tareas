package com.prueba.tareas.domain.service;

import com.prueba.tareas.infrastructure.dao.TareaDao;
import com.prueba.tareas.application.dto.TareaResponse;
import com.prueba.tareas.application.dto.TareaRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The type Tarea service.
 */
@Slf4j
@Service
public class TareaServiceImpl implements TareaService{
    /**
     * The Tarea dao.
     */
    @Autowired
    TareaDao tareaDao;

    @Override
    @Transactional
    public TareaResponse createTarea(TareaRequest tarea) {
        log.info(String.format("createTarea -> Se va a crear la tarea: %s", tarea.toString()));
        return tareaDao.save(tarea);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TareaResponse> getAllTareas() {
        log.info("getAllTareas -> Obtener todas las tareas");
        return tareaDao.findAll();
    }
}
