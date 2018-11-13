/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empezar;

import java.io.File;

/**
 *
 * @author Sebastian
 */
public class Borrar {
    public static  void BorrarFichero(File Ffichero){
     try {
         if(Ffichero.exists()){  
           Ffichero.delete(); 
           System.out.println("Fichero Borrado con Exito");
         }
     } catch (Exception ex) { 
          System.out.println(ex.getMessage());
     }
}
}
