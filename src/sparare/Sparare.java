/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparare;
import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.*;

import javax.swing.JOptionPane;

public class Sparare {
    public static void spara(Object f, String filename) {
        try {
            XMLEncoder encoder
                    = new XMLEncoder(
                            new BufferedOutputStream(
                                    new FileOutputStream(filename)));
            encoder.writeObject(f);
            encoder.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error", "Det gick inte att spara" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
}
public static Object ladda(String filename)  {
        try {
            XMLDecoder decoder
                    = new XMLDecoder(new BufferedInputStream(
                            new FileInputStream(filename)));
            Object o = decoder.readObject();
            decoder.close();
            return o;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error", "Det gick inte att ladda in filen" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);   
     }
            return null;
    }
}