public class Arraystringhe {
    public static void main(String[] args) {
        String[] nomi = {"Anna", "Luca", "Alberto", "Giulia", "Andrea"};

        for (int i = 0; i < nomi.length; i++) {
            String currentElement= nomi[i].trim();

            if(currentElement.toUpperCase().startsWith("A")) {

                System.out.println(currentElement.trim());
            }
            
        }
    }

}
