package Others.OCA.exercises1.Q225;

public class MathFunctions {

    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;

    }


    public static void main(String[] args) {

        int a = 15;
        int b = 10;
        MathFunctions.addToInt(a, b);       //print nothing
        System.out.println(a);
    }
}

//output 15