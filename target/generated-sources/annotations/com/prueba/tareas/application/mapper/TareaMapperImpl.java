package com.prueba.tareas.application.mapper;

import com.prueba.tareas.application.dto.TareaRequest;
import com.prueba.tareas.application.dto.TareaResponse;
import com.prueba.tareas.domain.model.TareaEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-09T09:51:48+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class TareaMapperImpl implements TareaMapper {

    @Override
    public TareaResponse toDto(TareaEntity entity) {
        if ( entity == null ) {
            return null;
        }

        TareaResponse tareaResponse = new TareaResponse();

        tareaResponse.setTitulo( entity.getTitulo() );
        tareaResponse.setDescripcion( entity.getDescripcion() );
        tareaResponse.setEstado( entity.getEstado() );
        tareaResponse.setId( entity.getId() );
        tareaResponse.setFechaVencimiento( entity.getFechaVencimiento() );
        List<String> list = entity.getEtiquetas();
        if ( list != null ) {
            tareaResponse.setEtiquetas( new ArrayList<String>( list ) );
        }

        return tareaResponse;
    }

    @Override
    public List<TareaResponse> toDto(List<TareaEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<TareaResponse> list = new ArrayList<TareaResponse>( entity.size() );
        for ( TareaEntity tareaEntity : entity ) {
            list.add( toDto( tareaEntity ) );
        }

        return list;
    }

    @Override
    public TareaEntity tareaRequestToDto(TareaRequest tarea) {
        if ( tarea == null ) {
            return null;
        }

        TareaEntity tareaEntity = new TareaEntity();

        tareaEntity.setTitulo( tarea.getTitulo() );
        tareaEntity.setDescripcion( tarea.getDescripcion() );
        tareaEntity.setFechaVencimiento( tarea.getFechaVencimiento() );
        List<String> list = tarea.getEtiquetas();
        if ( list != null ) {
            tareaEntity.setEtiquetas( new ArrayList<String>( list ) );
        }
        tareaEntity.setEstado( tarea.getEstado() );

        return tareaEntity;
    }
}
