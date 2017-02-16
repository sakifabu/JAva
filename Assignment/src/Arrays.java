/**
 * Created by sakif on 2/6/2017.
 */
public class Arrays {

    public static void arrayone(int[] array) {
        int a = array[0];
        int b = array[array.length - 1];
        array[0] = b;
        array[array.length - 1] = a;
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }

    }

    public static void arraytwo(int[] array) {
        for (int k = 0; k < array.length; k++) {
            if (array[k] % 2 == 0) {
                array[k] = 0;
            }
            System.out.print(array[k]);
        }

    }
    public static int arraythree(int[] array) {
        int largest = array[0];
        for (int k = 0; k < array.length; k++) {
            if (array[k]>largest) {
                largest = array[k];
            }
        }
        return largest;
    }
    public static int arrayfour(int[] array) {
        int smallest = array[0];
        for (int k = 0; k < array.length; k++) {
            if (array[k]< smallest) {
                 smallest = array[k];
            }
        }
        return  smallest;
    }
    public static boolean arrayfive(int[] array) {
        boolean increasing;
        int smallest = array[0];
        for (int k = 0; k < array.length-1; k++) {
            if (array[k] > array[k+1]) {
                return increasing= false;
            }
        }
        return  increasing = true;
    }

    public static void main(String[] args) {
        int[] game = {2, 3, 4, 5, 6, 8, 9,0};
        arrayone(game);
        arraytwo(game);
        System.out.println(arraythree(game));
        System.out.println(arrayfour(game));
        System.out.print(arrayfive(game));
    }
}