/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandaty_ewidencjaaplikacjajavafx;

import java.util.ArrayList;
import java.util.LinkedList;


public class Ewidancja {
   private ArrayList<Kierowca> lista_kierowcow = new ArrayList<>();
       
   public Kierowca getKierowca(int pozycja){
       return lista_kierowcow.get(pozycja);
   }
   
   public void add_driver(String driver_imie, String driver_nazwisko, String driver_pesel){
   lista_kierowcow.add(new Kierowca(driver_imie, driver_nazwisko, driver_pesel));
   
//            Kierowca n = new Kierowca();
//            n.imie = driver_imie;
//            n.nazwisko = driver_nazwisko;
//            n.pesel = driver_pesel;
//        lista_kierowcow.add(n);
//        System.out.println("Kierowca: " +  driver_imie + " " + driver_nazwisko + " został dodany do systemu!");
        
        }
   public int find_kierowca (String pesel){
     int a = 0;
     int i;
       for (  i = 0; i < lista_kierowcow.size(); i++ ){
      if (lista_kierowcow.get(i).getPesel().equals(pesel)){
        System.out.println("tak");
          return i;
      }
          else 
           System.out.println("nie");
            a = -2;
      
       }

       return a;
            
}
}

