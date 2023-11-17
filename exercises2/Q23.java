package Others.OCA.exercises2;

import java.util.Arrays;

public class Q23 {

    public static void main(String[] args) {

        int[] random = {16, -41, 112, 10, -110};

        int x = 10;
//        Arrays.sort(random);
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);      //-1, it could not find it, because we did not sort it.

    }
}
