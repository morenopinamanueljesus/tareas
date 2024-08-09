package com.prueba.tareas.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

/**
 * The type Tarea entity.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TareaEntity {
    @Id
    private String id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaVencimiento;
    private List<String> etiquetas;
    private TareaEstado estado;
}


