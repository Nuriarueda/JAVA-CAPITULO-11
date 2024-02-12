/* Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500. */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1{
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));

            for (int i = 1; i < 501; i++){
                if(esPrimo(i)){
                    bw.write(String.valueOf(i) + "\n");
                }
            }

            bw.close();
        } catch (IOException ioe) {
            System.out.println("Error");
        }
    }

    public static boolean esPrimo(int x){

        for (int i = 2; i < x; i++){
            if ((x%i) == 0) {
                return false;
            }
        }
        return true;
    }
        
}