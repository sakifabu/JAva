/**
 * Created by sakif on 2/6/2017.
 */
public class Arrays {

    public static void arrayone(int[] array) {
        int a = array[0];
        int b = array[array.length - 1];
        array[0] = b;
        array[array.length-1] = a;
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k]);
        }

    }
    public static void evenswap(int [] array){
        for (int k = 0; k < array.length; k++) {
            if (array[k]%2 == 0){
                array[k]=0
            }
            break;
                
        }
    
    }
    public static void main(String[] args) {
        int[] game = {2,3,4,5,6,8,9};
        arrayone(game);
        }
    

    // B
    public static void shift(int[] seq) {
        int last = seq[seq.length - 1];
        System.arraycopy(seq, 0, seq, 1, seq.length - 1);
        seq[0] = last;
    }

    // C
    public static void replace(int[] seq, int replacement) {
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] % 2 == 0) {
                seq[i] = replacement;
            }
        }
    }

    // D
    public static int[] replaceByNeighBours(int[] seq) {
        for (int i = 1; i < seq.length - 1; i++) {
            if (seq[i + 1] > seq[i - 1]) {
                seq[i] = seq[i + 1];
            } else if (seq[i - 1] > seq[i + 1]) {
                seq[i] = seq[i - 1];
            }
        }
        return seq;
    }

    // E
    public static void removeMiddleElement(int[] seq) {
        int middle = seq.length / 2;
        if (seq.length % 2 == 0) {
            for (int i = middle; i < seq.length - 1; i++) {
                seq[i - 1] = seq[i + 1];
            }
            seq[seq.length - 1] = 0;
            seq[seq.length - 2] = 0;
        } else if (seq.length % 2 == 1) {
            for (int i = middle; i < seq.length - 1; i++) {
                seq[i] = seq[i + 1];
            }
            seq[seq.length - 1] = 0;
        }
    }

    // F
    public static void moveEvenElements(int[] seq) {
        int swapPos = 0;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] % 2 == 0) {
                int temp = seq[swapPos];
                seq[swapPos] = seq[i];
                seq[i] = temp;
                swapPos += 1;
            }
        }
    }

    // G
    public static int secondLargestElement(int[] seq) {
        int largest = seq[0];
        int secondLargest = largest;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] > largest) {
                int temp = largest;
                largest = seq[i];
                secondLargest = temp;
            }
        }
        return secondLargest;
    }

    // H
    public static boolean isSorted(int[] seq) {
        for (int i = 0; i < seq.length - 1; i++) {
            if (seq[i] > seq[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // I
    public static boolean hasAdjacentDuplicates(int[] seq) {
        for (int i = 0; i < seq.length - 1; i++) {
            if (seq[i] == seq[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // J
    public static boolean hasDuplicateElements(int[] seq) {
        for (int i = 0; i < seq.length; i++) {
            for (int j = 0; j < seq.length; j++) {
                if (i != j && seq[i] == seq[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}*/
