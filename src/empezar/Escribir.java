/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empezar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author Sebastian
 */
public class Escribir {

    public static void EscribirFichero(File Ffichero, String SCadena) {
        try {
            if (!Ffichero.exists()) {
                Ffichero.createNewFile();
            }
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Ffichero, true), "utf-8"));
            Fescribe.write(SCadena + "\r\n");
            Fescribe.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
