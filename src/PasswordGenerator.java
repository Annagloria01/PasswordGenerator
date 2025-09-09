
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
       
        System.out.println("Inserisci il tuo nome");

         String nome= scanner.nextLine();

         System.out.println("Inserisci il tuo cognome");

         String cognome= scanner.nextLine();

         System.out.println("Inserisci il tuo colore preferito");

         String colorePreferito= scanner.nextLine();

         System.out.println("Inserisci il giorno della tua nascita");

         int dataDiNascita= scanner.nextInt();

         System.out.println("Inserisci il mese della tua nascita");

         int meseDiNascita= scanner.nextInt();

         System.out.println("Inserisci il tuo anno di nascita");

         int annoDiNascita= scanner.nextInt();


         int somma = dataDiNascita + meseDiNascita + annoDiNascita;

         System.out.println("La tua password è:" + nome + "-" + cognome + "-" + colorePreferito + "-" + somma);


    }
}
