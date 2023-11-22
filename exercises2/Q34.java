package Others.OCA.exercises2;

public class Q34 {

    public static void main(String[] args) {

        //What is the output of the following code snippet?
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
            } catch (RuntimeException e) {
             System.out.print("c");
            } finally {
             System.out.print("d");
             }
         System.out.print("e");

    }
}


//output abcde