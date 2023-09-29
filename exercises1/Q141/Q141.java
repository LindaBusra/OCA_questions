package Others.OCA.exercises1.Q141;

import java.util.Arrays;

public class Q141 {

    public static void main(String[] args) {
        String names [] = {"Thomas", "Peter", "Joseph"};
        String pwd [] = new String[3];
        int idx = 0;
        try{
            for(String n : names){
                pwd[idx] = n.substring(2,6);  //n.substring(2,6);  2.index inclusive, 6. index exclusive
                System.out.println(pwd[idx]);
                idx++;
            }
        }
        catch (Exception e){
            System.out.println("Invalid Name");

        }


        //note:
        System.out.println(Arrays.toString(pwd));   //[omas, null, null]

    }


    /*What is result?

    omas
    Invalid Name        */



}
