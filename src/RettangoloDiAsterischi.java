import java.util.Scanner;

public class RettangoloDiAsterischi {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero per le righe");
        int numeroRighe = scanner.nextInt();
        System.out.println("Inserisci un numero per le colonne");
        int numeroColonne = scanner.nextInt();

        
        for (int i = 1; i <= numeroRighe; i++) {
            for (int j= 1; j <=numeroColonne; j++) {
                System.out.print("*");
                
                
            }
            System.out.println("");
            
        }
    }
}


