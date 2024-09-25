package com.hampcode.tutoria_apoyo_academico.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {

    }
    public ResourceNotFoundException(String message) {
        super(message);
    }
}