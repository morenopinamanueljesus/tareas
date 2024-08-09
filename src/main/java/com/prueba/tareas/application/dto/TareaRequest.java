package com.prueba.tareas.application.dto;

import com.prueba.tareas.domain.model.TareaEstado;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

/**
 * The type Tarea request.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TareaRequest {
    private String titulo;
    private String descripcion;
    private LocalDate fechaVencimiento;
    private TareaEstado estado;
    private List<String> etiquetas;
}
