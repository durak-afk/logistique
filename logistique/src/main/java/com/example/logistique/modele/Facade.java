package com.example.logistique.modele;

import java.util.Collection;

public interface Facade {

    long creerPersone(String nom, String prenom, String login, String password) ;
    Personne getPersonneById(long id) throws PersonneNotFoundException;
    Collection<Personne> getAllPersonnes();
}
