package Others.OCA.exercises2;

public class Q03 {
    public static void main(String[] args) {

        final char a = 'A', d='D'; // final keyword defines last value of variable

        char grade='B';

        switch (grade){
            case  a :
            case 'B': System.out.print("great");
            case 'C': System.out.print("good"); break ;
            case  d :
            case 'F': System.out.print("not good");
        }
    }
}
