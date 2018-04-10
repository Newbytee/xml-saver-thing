/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparare;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tinber
 */
public class Testa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        ArrayList<Person> lista;
        lista = (ArrayList<Person>)Sparare.ladda("minlista.xml");
        if (lista == null) {
            lista = new ArrayList<>();
        }
        System.out.println("Ange förnamn");
        String fnamn = input.next();
        System.out.println("Ange efternamn");
        String enamn = input.next();
        lista.add(new Person(fnamn,enamn));
        Sparare.spara(lista, "minlista.xml");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
               
    }
    
}
