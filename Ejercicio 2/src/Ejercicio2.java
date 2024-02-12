/* Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
            String linea = "";
            
            while (linea!=null){
                System.out.println(" ");
                linea = br.readLine();
            }

            System.out.println();
            br.close();

        }catch(IOException io){
            System.out.println("No se ha encontrado el archivo");
        }
    }
}