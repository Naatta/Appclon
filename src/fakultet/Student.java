/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class Student extends Osoba{
    
    private int brojIndeksa;
    private List<Ispit> spisakPolozenihIspita = new ArrayList<>();
    private boolean diplomirao = false;

    public Student(String ime, String prezime, int brojIndeksa, boolean diplomirao) {
        super(ime, prezime);
        this.brojIndeksa = brojIndeksa;
        this.diplomirao = diplomirao;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public List<Ispit> getSpisakPolozenihIspita() {
        return spisakPolozenihIspita;
    }

    public void setSpisakPolozenihIspita(List<Ispit> spisakPolozenihIspita) {
        this.spisakPolozenihIspita = spisakPolozenihIspita;
    }

    public boolean isDiplomirao() {
        return diplomirao;
    }

    public void setDiplomirao(boolean diplomirao) {
        this.diplomirao = diplomirao;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
}
