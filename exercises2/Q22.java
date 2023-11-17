package Others.OCA.exercises2;

import java.util.Arrays;

public class Q22 {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 053, 4};
        //bir sayi 053 seklinde yazildiginda java bunu 8li sistemde kabul eder.
        //bu sayiyi 10lu sisteme cevirirsek 053 -->5*8+3*1=43

        int arr2[][] = { {1,2,4}, {2,2,1}, {0,43,2}};

        System.out.println(Arrays.toString(arr2[1]));       //[2, 2, 1]  for print out inner arrays
        System.out.println(Arrays.deepToString(arr2));      //print out multidimensional array

        System.out.print(arr1[3]== arr2[0][2]);   //true

        System.out.print(" " + (arr1[2]==arr2[2][1]));  //true
    }
}
