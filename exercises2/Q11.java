package Others.OCA.exercises2;

public class Q11 {

    public static void main(String[] args) {
        int value = 9;
        long result = square(value);
        System.out.println(value);

    }

    public static  long square(int x) {
        long y = x * (long)x;
        x= -1;
        return y;
    }
}


//what is the output?  9