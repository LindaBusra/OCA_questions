package Others.OCA.exercises1.Q169.clothing.pants;

//line n1
import static Others.OCA.exercises1.Q169.clothing.Shirt.getColor;

public class Jeans {

    public void matchShirt(){

        //line n2
        String color = getColor();
        if(color.equals("Green")) {
            System.out.println("Fit");
        }
    }

    public static void main(String[] args) {

        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }
}
