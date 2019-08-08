/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultet;

import java.time.LocalDateTime;

/**
 *
 * @author Korisnik
 */
public class Ispit {
    
    private String predmet;
    private Profesor profesor;
    private int ocena;
    private LocalDateTime datum;

    public Ispit(String predmet, Profesor profesor, int ocena, LocalDateTime datum) {
        this.predmet = predmet;
        this.profesor = profesor;
        this.ocena = ocena;
        this.datum = datum;
    }

    
    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }
    
    
    
}
