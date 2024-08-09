package com.prueba.tareas.application.dto;

import com.prueba.tareas.domain.model.TareaEstado;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/**
 * The type Tarea response.
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TareaResponse {
    private String id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaVencimiento;
    private List<String> etiquetas;
    private TareaEstado estado;
}
