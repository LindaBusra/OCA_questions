package Others.OCA.exercises2;

import java.util.Arrays;

public class Q24 {
    public static void main(String[] args) {

        String[] fruits = {
                "banana",
                "apple",
                "pears",
                "grapes"
        };
        Arrays.sort(fruits);
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");   //apple banana grapes pears

        }


        System.out.println(Arrays.binarySearch(fruits, "banana"));  //apple banana grapes pears 1
        System.out.println(Arrays.binarySearch(fruits, "z"));  //apple banana grapes pears -5, could not find it, it is after pears, order 5
        System.out.println(Arrays.binarySearch(fruits, "ababa"));  //apple banana grapes pears -1, could not find it, it is before apple
    }
}
