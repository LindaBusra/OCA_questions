package Others.OCA.exercises1.Q199;

public class Q199 {
    public static void main(String[] args) {
        String stuff = "TV";
        String res = null;

        if (stuff.equals("TV")) {
            res = "Walter";
        } else if (stuff.equals("Movie")) {
            res = "White";
        } else {
            res = "No Result";
        }

        System.out.println(res);
    }
}

/*
A) stuff.equals("TV") ? res = "Walter": stuff.equals("Movie") ? res = "White" : res = "No Result";
B) res = stuff.equals("TV") ? "Walter" else stuff.equals("Movie") ? "White" : "No Result";
C) res = stuff.equals("TV") ? stuff.equals("Movie") ? "Walter" : "White" : "No Result";
D) res = stuff.equals("TV") ? "Walter": stuff.equals("Movie") ? "White" : "No Result";

Answer :D
 */