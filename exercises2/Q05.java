package Others.OCA.exercises2;

public class Q05 {

    public static void main(String[] args) {

        int x=0;
        String s=null;  //it shows just we did not assign anything to s, it is just pointer, s has no any value

//        if (x==s) System.out.println("Success");
//        else System.out.println("Failure");


        //What is the output?
        //The code will not compile because of line10




        /*Some notes:
        we can not use null for primitive data types
        int num = null;
        boolean age = null;

        we can use null for non-primitive data types
         */
        Integer num = null;
        Boolean bl = null;

        String str1;
        String str2 = new String();
        String str3 = "";
        String str4 = null;     //it is not a String, we just assign null to this value

        /*
        Stack (reference of objects)                              pointer          Heap memory (container)
        str1  (it creates just reference for str1), not container
        str2 (reference)                                          --->             container + (it is empty now)
        str3 (reference)                                          --->             container ( with "")
        str4 (reference)                                          --->
            str4 has pointer, but it not refers any container

        */


        System.out.println("try to print");
//        System.out.println(str1);       //because we did not assign it
        System.out.println(str2);       //
        System.out.println(str3);       //
        System.out.println(str4);       //null

        System.out.println("try concatenation");
//        System.out.println("java " + str1);       //because we did not assign it
        System.out.println("java " + str2);       //java
        System.out.println("java " + str3);       //java
        System.out.println("java " + str4);       //java null


        System.out.println("print length");
//        System.out.println(str1.length());       //because we did not assign it
        System.out.println(str2.length());       //0
        System.out.println(str3.length());       //0
        System.out.println(str4.length());       //NullPointerException


        //all have same output after assigning
        //I can assign a new value all of them, and use them
        str1= "java";
        System.out.println(str1);       //java

        str2= "java";
        System.out.println(str2);       //java

        str3= "java";
        System.out.println(str3);       //java

        str4= "java";
        System.out.println(str4);       //java

    }
}
