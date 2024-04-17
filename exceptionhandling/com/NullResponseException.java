package com;


public class NullResponseException extends Exception {
    
    public NullResponseException() {
        super("Null object returned");
    }

    public NullResponseException(String message) {
        super(message);
    }
}
