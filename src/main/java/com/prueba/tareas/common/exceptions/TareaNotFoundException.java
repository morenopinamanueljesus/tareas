package com.prueba.tareas.common.exceptions;

/**
 * The type Tarea not found exception.
 */
public class TareaNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new Tarea not found exception.
     *
     * @param message the message
     */
    public TareaNotFoundException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Tarea not found exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public TareaNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
