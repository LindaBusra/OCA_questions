package Others.OCA.exercises2;

import java.util.Arrays;
import java.util.List;

public class Q28 {
    public static void main(String[] args) {

        String [] names = {"Tom", "Dick", "Harry"};
//        List<String> list = names.asList();       //CTE

        //We can fix it:
        List<String> list = Arrays.asList(names);
        list.set(0, "Sue");
        System.out.println(names[0]);       //Array elements changed also
    }
}
