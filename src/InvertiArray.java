public class InvertiArray {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};

        int [] nuovoArray= new int[a.length];

        int j = 0;
        for (int i = a.length-1; i >= 0; i--){
            int currentElement=a[i];
            nuovoArray[j]=currentElement;
            j++;
        }

        for (int i = 0; i < nuovoArray.length; i++) {
            System.out.println(nuovoArray[i]);
        }


        
    }

}
