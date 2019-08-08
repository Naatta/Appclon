/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultet;

/**
 *
 * @author Korisnik
 */
public class Profesor extends Osoba{
    
    private int brojRadneKnjizice;

    public Profesor(String ime, String prezime) {
        super(ime, prezime);
    }

    public int getBrojRadneKnjizice() {
        return brojRadneKnjizice;
    }

    public void setBrojRadneKnjizice(int brojRadneKnjizice) {
        this.brojRadneKnjizice = brojRadneKnjizice;
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
