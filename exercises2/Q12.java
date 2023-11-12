package Others.OCA.exercises2;

public class Q12 {

    public static void main(String[] args) {

//        for(int i=0; i<10; ) {
//
//            i = i++;   //when it is post increment, result is infinitive loop
//            System.out.println(i + " Hello World");
//
//        }


        for(int i=0; i<10; ) {
            i++;
            System.out.println(i + " Hello World");
        }


        for(int i=0; i<10; ) {
            ++i;
            System.out.println(i + " Hello World");
        }

        for(int i=0; i<10; ) {
            i +=2;
            System.out.println(i + " Hello World");
        }


        for(int i=0; i<10; ) {
            i = i+1;
            System.out.println(i + " Hello World");
        }
    }
}
