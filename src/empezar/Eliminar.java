/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empezar;

import static empezar.Borrar.BorrarFichero;
import static empezar.Escribir.EscribirFichero;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;

/**
 *
 * @author Sebastian
 */
public class Eliminar {
     public void EliminarFichero(File FficheroAntiguo,String Satigualinea){        
        Random numaleatorio= new Random(3816L); 
        String SnombFichNuev=FficheroAntiguo.getParent()+"/auxiliar"+String.valueOf(Math.abs(numaleatorio.nextInt()))+".txt";
        File FficheroNuevo=new File(SnombFichNuev);
        try {
            if(FficheroAntiguo.exists()){
                BufferedReader Flee= new BufferedReader(new FileReader(FficheroAntiguo));
                String Slinea;
                while((Slinea=Flee.readLine())!=null) { 
                    if (!Slinea.toUpperCase().trim().equals(Satigualinea.toUpperCase().trim())) {
                       EscribirFichero(FficheroNuevo,Slinea);
                    }else{
                    }             
                }
                String SnomAntiguo=FficheroAntiguo.getName();
                BorrarFichero(FficheroAntiguo);
                FficheroNuevo.renameTo(FficheroAntiguo);
                Flee.close();
            }else{
                System.out.println("Fichero No Existe");
            }
        } catch (Exception ex) {
             System.out.println(ex.getMessage());
        }
    }
}
