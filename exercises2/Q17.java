package Others.OCA.exercises2;

public class Q17 {

    static int num =5;
    String lesson = "Java";

    public static void main(String[] args) {

        //Question, what is the result of this code?   Compile time error beacuse of line 15

//        do {
//            int y = 1;
//            System.out.print(y++ + " ");
//            } while(y <= 10);         //it can not read y because of scope



        //How can we fix this error

        int y;
        do {
            y= 1;
            System.out.print(y++ + " ");
            } while(y <= 10);         //it can not read y because of scope



//------------------------------------------------------------------------------------------

        //Notes for scope;

//        lesson = "JDBC";  variable is not static
        int mainNum = 30;   //local variable

        for(int i=0; i<10; i++){        //i is local variable of for loop
            System.out.println(i);
            String lesson3 = "SQL";     //local variable of for loop
        }

//        System.out.println(i);        //i is local variable of for loop
//        lesson3 = "API";              //lesson3 is local variable of for loop

    }

    public static void staticMethod(){
        num = 100;
//        System.out.println(lesson);  it is not static variable, so we can not get in.
//        mainNum = 50; it was local variable of main method.
//        System.out.println(lesson2);  lesson2 is local variable of nonStaticMethod
    }


    public void nonStaticMethod(){
        num=150;
        lesson = "postgreSQL";
//        mainNum = 50; it was local variable of main method.
        String lesson2 = "mySQL";

    }
}
