import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            BufferedWriter bw = new BufferedWriter (new FileWriter("Text.txt"));
            bw.write("YO LAS BOLITAS");
            bw.write("\nPA LA GENTA");
            bw.close();
        } catch (IOException ioe) {
            System.out.println("Error");
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("Text.txt"));
            String line = "";
            while ((line = br.readLine()) !=null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException ioe) {
            System.out.println("error");
        }
    }
}
