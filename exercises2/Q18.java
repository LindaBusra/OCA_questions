package Others.OCA.exercises2;

public class Q18 {

    public static void main(String[] args) {

        int count = 0;
        ROW_LOOP: for(int row = 1; row <=3; row++)
            //in this form we can not use any code between inner outher loop
            for(int col = 1; col <=2 ; col++) {
                if(row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }           //inner and outher loop close in this line
        System.out.println(count);



        //actually it is like that
        int count1 = 0;
        for(int row = 1; row <=3; row++) {
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue;
                count1++;
            }
        }
        System.out.println(count1);
    }
}
