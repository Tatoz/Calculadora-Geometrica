/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_geometrica;

/**
 *
 * @author juancarlos
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

    public LeerFichero() throws IOException{
    }
    
    public String muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        
        String c = "";
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            c += cadena+"\n";
        }
        b.close();
        return c;
    }
/*
    public static void main(String[] args) throws IOException {
        LeerFichero a = new LeerFichero();
        a.muestraContenido("direccionOptica.txt");
    }*/
   
}