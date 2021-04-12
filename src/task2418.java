import java.util.*;
public class task2418 {
    public static void main(String[] args) {
        int[] a1 = {1, 4, 4, 8, 9};
        int[] a2 = {1, 3, 7, 9};
        int[] a3 = new int[a1.length + a2.length];
        int ix1 = 0;
        int ix2 = 0;

        for (int i = 0; i < a3.length; i++) {
            if (ix2 >= a2.length || ix1 < a1.length && a1[ix1] < a2[ix2]) {
                a3[i] = a1[ix1];
                ix1++;
            } else {
                a3[i] = a2[ix2];
                ix2++;
            }
        }

        for (int k = 0; k < a3.length; k++) {
            System.out.print(a3[k]);
        }
    }
}


