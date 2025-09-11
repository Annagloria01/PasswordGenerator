
import java.util.Scanner;

public class Fattoriale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numero = scanner.nextInt();

        int fattoriale = numero;
        String stringFattoriale = "" + numero;
        for (int i = numero - 1; i >= 1; i--) {
            fattoriale *= i;
            stringFattoriale+= "x" + i;
        }
        System.out.println(stringFattoriale + " = " + fattoriale);
    }
}
