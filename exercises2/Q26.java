package Others.OCA.exercises2;

import java.util.ArrayList;

public class Q26 {
    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);
        for (int i = 0; i < values.size() ; i++)
            System.out.print(values.get(i));        //6
    }
}
