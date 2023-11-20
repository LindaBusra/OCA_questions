package Others.OCA.exercises2;

public class Q29 {

    public static void main(String[] args) {
        int sayi = 0;
        int sum=0;

        for (sayi = 3; sayi>1 ; sayi/=sayi++)
            sum+=sayi;

        System.out.println(sum);
    }
}

//What is the output?  3