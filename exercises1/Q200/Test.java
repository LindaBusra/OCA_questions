package Others.OCA.exercises1.Q200;


import java.util.ArrayList;
import java.util.List;

class Patient{
    String name;
    public Patient(String name){
        this.name=name;
    }
}


public class Test {

    public static void main(String[] args) {

        List ps=new ArrayList();
        Patient p2= new Patient("Mike");

        ps.add(p2);



        //insert code here-----------------------------------------------
        int f= ps.indexOf(p2);      //System.out.println(ps.indexOf(p2));  0


        //--------------------------------------------------------------

        if (f>=0){
            System.out.println("Mike found");
        }

    }
}

/*

A)
int f= ps.indexOf(p2);   +

B)
int f= ps.indexOf(Patient("Mike"));

C)
int f= ps.indexOf(new Patient("Mike"));

D)
Patient p = new Patient("Mike");
int f = ps.indexOf(p);

Answer : A
 */
