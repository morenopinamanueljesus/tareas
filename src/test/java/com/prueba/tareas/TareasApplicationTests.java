package com.prueba.tareas;

import com.prueba.tareas.infrastructure.dao.TareaDaoImpl;
import com.prueba.tareas.domain.model.TareaEstado;
import com.prueba.tareas.application.dto.TareaRequest;
import com.prueba.tareas.application.dto.TareaResponse;
import com.prueba.tareas.domain.service.TareaServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * The type Tareas application tests.
 */
@SpringBootTest
class TareasApplicationTests {
	@Mock
	private TareaDaoImpl dao;

	@InjectMocks
	private TareaServiceImpl service;

	/**
	 * Sets up.
	 */
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	/**
	 * Test create tarea.
	 */
	@Test
	public void testCreateTarea() {
		TareaRequest tarea = new
				TareaRequest("título", "descripción", LocalDate.now(),TareaEstado.PENDING, Collections.emptyList());
		TareaResponse response = new TareaResponse("","título", "descripción", LocalDate.now(),new ArrayList<>(), TareaEstado.PENDING);
		when(dao.save(tarea)).thenReturn(response);
		TareaResponse createdTarea = service.createTarea(tarea);
		assertEquals(tarea.getTitulo(), createdTarea.getTitulo());
		assertEquals(tarea.getDescripcion(), createdTarea.getDescripcion());
	}

	/**
	 * Test get all tareas.
	 */
	@Test
	public void testGetAllTareas() {
		TareaResponse tarea = new TareaResponse("1", "título", "descripción", LocalDate.now(), Collections.emptyList(), TareaEstado.PENDING);
		when(dao.findAll()).thenReturn(List.of(tarea));
		List<TareaResponse> tareas = service.getAllTareas();
		assertEquals(1, tareas.size());
		assertEquals(tarea.getTitulo(), tareas.get(0).getTitulo());
	}

}
