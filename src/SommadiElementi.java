public class SommadiElementi {

    public static void main(String[] args) {
         int [] a = {1, 2, 3, 4, 5};
         int somma=0;

         for (int i = 0; i < a.length; i++) {
             int currentElement=a[i];
             somma+=currentElement;
         }
         System.out.println(somma);
    }
}
