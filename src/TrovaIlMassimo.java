
public class TrovaIlMassimo {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            int currentElement = a[i];

            if (currentElement > max) {
                max = currentElement;
            }

        }
        System.out.println(max);
    }
}
