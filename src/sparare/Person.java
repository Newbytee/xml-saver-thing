/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparare;

/**
 *
 * @author tinber
 */
public class Person {
    private String fnamn;
    private String enamn;

    public Person() {
    }

    public Person(String fnamn, String enamn) {
        this.fnamn = fnamn;
        this.enamn = enamn;
    }

    public String getFnamn() {
        return fnamn;
    }

    public void setFnamn(String fnamn) {
        this.fnamn = fnamn;
    }

    public String getEnamn() {
        return enamn;
    }

    public void setEnamn(String enamn) {
        this.enamn = enamn;
    }

    @Override
    public String toString() {
        return fnamn + "\t" + enamn +"\n";
    }
    
    
}
