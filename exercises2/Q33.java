package Others.OCA.exercises2;

public class Q33 {

    public static void main(String[] args) {

        boolean keepGoing = true;
        int count = 0;
        int x = 3;

        while(count++ < 3) {   //count'=1,2,3
            int y = (1 + 2 * count) % 3;   //y=0, 2, 1
            switch(y) {
                default:
                    case 0: x -= 1; break;   //x=2, 1
                    case 1: x += 5;          //x=6
                    }
            }
        System.out.println(x);   //6
    }
}
