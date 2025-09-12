public class TrovaIlMinimo {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};


        int minimo=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            int currentElement=a[i];

            if(currentElement<minimo){
                minimo=currentElement;
            }
        }
        System.out.println(minimo);
    }

}
