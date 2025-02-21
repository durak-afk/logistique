package com.example.logistique.modele;

public class PersonneNotFoundException extends Exception {

    public PersonneNotFoundException() {
        super("Personne not found");
    }

    public PersonneNotFoundException(String message) {
        super(message);
    }

    public PersonneNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonneNotFoundException(Throwable cause) {
        super(cause);
    }
}
