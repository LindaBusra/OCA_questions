package Others.OCA.exercises1.Q163;

public class Q163 {

    public static void main (String []args) {
        int x=1;
        int y=0;
        if (x++>++y) {
            System.out.println("Hello");
        } else {
            System.out.println("Welcome");
        }

        System.out.println("log"+x+":"+y);
    }
}


/*
What is the result?
A. Hello Log 1:0
B. Hello Log 2:1
C. Welcome Log 2:1
D. Welcome Log 1:0
Answer: C
 */