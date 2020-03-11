/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandaty_ewidencjaaplikacjajavafx;

enum Status{ukarany, nieukarany, mandat_zaplacony};


public class Kierowca {
   private String pesel;
   private String imie; 
   private String nazwisko;
   private Status stan = Status.nieukarany;
   private int suma_punktow;
   private int suma_mandatow; 
  
    public Kierowca (){}
    public Kierowca (String imie, String nazwisko, String pesel){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    
    }
   
    public void setDriver (String pesel, String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }
    
    public String getPesel (){
     return pesel;
    }
    public String getImie (){
     return imie;
    }
    public String getNazwisko (){
     return nazwisko;
    }
    public Status getStan(){
     return stan;
    } 
    public int suma_punktow (){
    return suma_punktow;
    }
    public int suma_mandatow (){
    return suma_mandatow;
    }
    
    public int ukaracMandatem (int mandat){
        suma_mandatow = suma_mandatow + mandat;
        if (stan == Status.nieukarany){
        stan = Status.ukarany;
        }
        return (suma_mandatow);
    }
     public int ukaracPunktami (int punkty){
        if (stan == Status.nieukarany){
        stan = Status.ukarany;
        }
       suma_punktow = suma_punktow + punkty;
         return (suma_punktow );
    }
    public int zaplacMandat (int mandat){
        suma_mandatow = suma_mandatow - mandat;
        if (stan == Status.ukarany){
        stan = Status.mandat_zaplacony;
        }
        return (suma_mandatow);
    }
      
    
    @Override     public String toString(){  
        String n= " Kierowca: " + getImie () + " " + getNazwisko () + ", pesel: " 
                + getPesel () + " jest " + getStan() + ", suma punktow: " + suma_punktow () + ", suma mandatow: " + suma_mandatow ();
        return n;
    
}
}