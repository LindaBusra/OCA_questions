package Others.OCA.exercises1.Q165;

public class OraString {

    String s;

    public boolean equals (OraString str) {
        return this.s.equalsIgnoreCase(str.toString());
    }

    OraString(String s){
        this.s=s;
    }

//and the code fragment:

    public static void main(String[] args) {

        String s1="Moon";

        OraString s2=new OraString("Moon");

        if ((s1=="Moon")&&(s2.equals("Moon"))) {
            System.out.println("A");
        }else {
            System.out.println("B");
        }

        if (s1.equals(s2.s)) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }

    }}


/*
What is the result?
A. AC
B. BD
C. BC  +
D. AD
Answer: C
 */