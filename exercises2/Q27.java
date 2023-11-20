package Others.OCA.exercises2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q27 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);

        System.out.println(list);       //[-1, 4, 5, 10]
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);


    }
}

//output -1