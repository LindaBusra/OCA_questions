package Others.OCA.exercises1.Q107;

public class Test {

    public static void main(String[] args) {


//        boolean a = new Boolean(Boolean.valueOf(args[0]));
//        boolean b = new Boolean(args[1]);


        boolean a1 = new Boolean(Boolean.valueOf("1"));
        boolean b1 = new Boolean(null);
        System.out.println(a1 + " " + b1);      //false  false


    }
}

/*
And given the commands
javac Test.java
java Test 1 null

What is the result
A. 1 null
B. true false
C. false false    ++   I think the result is this one
D. true true
E. A ClassCastException is thrown at runtime.
Answer: D

 */