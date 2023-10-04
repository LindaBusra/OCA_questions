package Others.OCA.exercises1.Q151;

public class Alpha {

    int ns;
    static int s;

    Alpha(int ns){
        if(s<ns) {
            s=ns;
            this.ns = ns;
        }
    }

    void doPrint(){
        System.out.println("ns= " + ns + " s= " + s);
    }
}


