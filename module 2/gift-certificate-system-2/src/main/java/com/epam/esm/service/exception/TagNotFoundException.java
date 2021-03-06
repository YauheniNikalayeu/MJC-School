package com.epam.esm.service.exception;

public class TagNotFoundException extends RuntimeException {

    private long id;
    private String message;

    public TagNotFoundException() {}

    public TagNotFoundException(long id, String message) {
        this.id = id;
        this.message = message;
    }


    public long getId() {
        return id;
    }

    @Override
    public String getMessage() {
        return message;
    }




}
