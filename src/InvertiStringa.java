
import java.util.Scanner;

public class InvertiStringa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola");
        String parola= scanner.nextLine();


        
        for (int i = parola.length()-1; i >= 0; i--) {
           char carattere = parola.charAt(i);
           System.out.print(carattere);
        }
    }

}
