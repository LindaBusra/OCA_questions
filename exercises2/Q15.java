package Others.OCA.exercises2;

public class Q15 {

    public static void main(String[] args) {

        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
            i--;
            if(i==8) keepGoing = false;
            result -= 2;
        } while(keepGoing);

        System.out.println(result);


       //what is the result? //11
    }
}
