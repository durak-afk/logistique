package com.example.logistique.modele;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FacadeImplementation implements Facade{

    private Map< Long, Personne> personneMap ;

    public FacadeImplementation() {
        this.personneMap = new HashMap<>();
    }

    @Override
    public long creerPersone(String nom, String prenom, String login, String password) {
        Personne personne = Personne.creer(nom, prenom, login, password);
        this.personneMap.put(personne.getIdentifiant(), personne);
        return personne.getIdentifiant();
    }

    @Override
    public Personne getPersonneById(long id) throws PersonneNotFoundException {
        if(this.personneMap.containsKey(id)){
            return this.personneMap.get(id);
        }else{
            throw new PersonneNotFoundException();
        }
    }

    @Override
    public Collection<Personne> getAllPersonnes() {
        return this.personneMap.values();
    }
}
