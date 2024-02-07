public class   Ejercicio3 {
    public static void main(String[] args) {
        if(args.length!=3){
            System.out.println("Número incorecto de argumentos");
            return;
        }
        try {
            FileMixer fm = new FileMixer();    
            fm.writeToFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
