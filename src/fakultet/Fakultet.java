/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fakultet;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author Korisnik
 */
public class Fakultet {

    public String naziv;
    public List<Student> spisakStudenata = new ArrayList<>();
    public int brojDesetki;

    public Fakultet(String naziv, int brojDesetki) {
        this.naziv = naziv;
        this.brojDesetki = brojDesetki;
    }
    
    public List<Student> studentiSaViseOdPetIspita(){
        List<Student> viseOdPet = new ArrayList<>();
        for(int i = 0; i < spisakStudenata.size(); i++){
            for(Student s : spisakStudenata){
                if(s.getSpisakPolozenihIspita().size()>5 && !s.isDiplomirao())
                    viseOdPet.add(s);
            }
        }
        return viseOdPet;
    }
    
    public int prosecnaOcena(String predmet, Profesor profesor){
        int suma = 0;
        int brojac = 0;
        for(Student s : spisakStudenata){
            for(Ispit i : s.getSpisakPolozenihIspita()){
                if(i.getProfesor().equals(i) && i.getPredmet().equals(predmet)){
                    suma = suma + i.getOcena();
                    brojac++;
                }
            } 
        }
        return suma/brojac;
    }
    
    public boolean dobioViseOdDevet(String... predmet){
        int brojac = 0;
        for(Student s : spisakStudenata){
            for(Ispit i : s.getSpisakPolozenihIspita()){
                for(String p : predmet){
                    if(i.getPredmet().equals(p) && i.getOcena()>9){
                        brojac++;
                    }
                }
            }
        }
        if(brojac == predmet.length){
            return true;
        }
        return false;
    }
    
    public String predmetiSaNajviseDesetki(){ // ovo ne radi dobro 
        List<String> predmeti = new ArrayList<>();
        int max = 0;
        String predmet = "";
        for(Student s : spisakStudenata){
            int brojac = 0;
            String pom = "";
            for(Ispit i : s.getSpisakPolozenihIspita()){
                if(i.getOcena()>9){
                    brojac++;
                    pom = i.getPredmet();
                }
            }
            if(brojac>max){
                max = brojac;
                predmet = pom;
            }
        }
        return predmet;
    }  
    
    public List<Student> nemajiNiJednuSesticu(){
        List<Student> studenti = new ArrayList<>();
        for(Student s : spisakStudenata){
            boolean nema = true;
            for(Ispit i : s.getSpisakPolozenihIspita()){
                if(i.getOcena()== 6){
                    nema = false;
                    break;
                }
            }
            if(nema){
                studenti.add(s);
            }
        }
        return studenti;
    }
//    
//    public Ispit poslednjiIspit(){ // hocu da resim preko DateTime klse
//        LocalDateTime curent = LocalDateTime.now();
//        
//        for(Student s : spisakStudenata){
//            for(Ispit i : s.getSpisakPolozenihIspita()){
//               
//            }
//        }
//        
//    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
