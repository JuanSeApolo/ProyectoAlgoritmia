/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empezar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Sebastian
 */
public class Leer {

    public static void LeerFichero(File Ffichero) {
        try {
            if (Ffichero.exists()) {
                BufferedReader Flee = new BufferedReader(new FileReader(Ffichero));
                String Slinea;
                System.out.println("**********Leyendo Fichero***********");
                while ((Slinea = Flee.readLine()) != null) {
                    System.out.println(Slinea);
                }
                System.out.println("*********Fin Leer Fichero**********");
                Flee.close();
            } else {
                System.out.println("Fichero No Existe");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
