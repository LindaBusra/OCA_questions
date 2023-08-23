package Others.OCA.exercises1.Q064;

public class ClassQ064 {

    public static void main(String[] args) {
        System.out.println("Hello "+ new StringBuilder("Java SE 8"));

        System.out.println("Hello "+ new MyString("Java SE 8"));  // Gets hash code : Others.OCA.Q064.MyString@12edcd21


        String x = new MyString("Java SE 8").msg;
        System.out.println("x: " + x);

        System.out.println("Hello" + new MyString("Hello").msg);

        //We can use .msg for take String




    }
}
