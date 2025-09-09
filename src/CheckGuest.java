
import java.util.Scanner;

public class CheckGuest {

    private static String[] nomiInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis, Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
   
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Inserisci il tuo nome utente");
        String tuoNome= scanner.nextLine();


        boolean found = false;

        for (int i = 0; i < nomiInvitati.length ; i++) {
            String currentElement = nomiInvitati[i];
            if(tuoNome.equals(currentElement)){
               found = true; 
            }
        }

        if(found){
            System.out.println("Puoi entrare");
        } else{
            System.out.println("Non puoi entrare");
        }


    }
    
    

}
