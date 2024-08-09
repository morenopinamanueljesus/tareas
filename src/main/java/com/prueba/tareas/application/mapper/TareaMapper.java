package com.prueba.tareas.application.mapper;

import com.prueba.tareas.domain.model.TareaEntity;
import com.prueba.tareas.application.dto.TareaResponse;
import com.prueba.tareas.application.dto.TareaRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * The interface Tarea mapper.
 */
@Mapper(componentModel = "spring")
public interface TareaMapper{
    /**
     * To dto tarea response.
     *
     * @param entity the entity
     * @return the tarea response
     */
    @Mapping(target = "titulo", source = "titulo")
    @Mapping(target = "descripcion", source = "descripcion")
    @Mapping(target = "estado", source = "estado")
    TareaResponse toDto(TareaEntity entity);

    /**
     * To dto list.
     *
     * @param entity the entity
     * @return the list
     */
    List<TareaResponse> toDto(List<TareaEntity> entity);

    /**
     * Tarea request to dto tarea entity.
     *
     * @param tarea the tarea
     * @return the tarea entity
     */
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "titulo", source = "titulo")
    @Mapping(target = "descripcion", source = "descripcion")
    @Mapping(target = "fechaVencimiento", source = "fechaVencimiento")
    @Mapping(target = "etiquetas", source = "etiquetas")
    @Mapping(target = "estado", source = "estado")
    TareaEntity tareaRequestToDto(TareaRequest tarea);
}
