/* Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        String line = "";
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
            
            do{
                line = br.readLine();
                System.out.println(line != null ? line : "");
            }while(line != null);

            br.close();

        }catch(IOException io){
            System.out.println("No se ha encontrado el archivo");
        }
    }
}