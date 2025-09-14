
import java.util.Scanner;

public class TriangoloDiAsterischi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int numero = scanner.nextInt();

        
        for (int i = 1; i <= numero; i++) {
            for (int j= 1; j <=i; j++) {
                System.out.print("*");
                
                
            }
            System.out.println("");
            
        }
    }
}
