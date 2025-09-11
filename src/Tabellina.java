
import java.util.Scanner;

public class Tabellina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci di quale numero stampare la tabellina");
        int numeroIniziale= scanner.nextInt();

        System.out.println("Inserisci fino a quale numero arrivare della tabellina");
        int numeroFinale= scanner.nextInt();

        for (int i = 0; i <= numeroFinale; i++) {
            int tabellina= numeroIniziale*i;
            System.out.println(tabellina);
        }
    }
}
