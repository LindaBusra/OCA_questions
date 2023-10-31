package Others.OCA.exercises1.Q213;

abstract class Toy {

    int price;

    //line n1

    //Which three code fragments are valid at line n1?

    //A +
    public static void insertToy(){

    }


    //B -
//    final Toy getToy(){
//        return new Toy();         //we can not crate object from abstract class
//    }


    //C -
//    public void printToy();       //public abstract void printToy();


    //D +
    public int calculatePrice(){
        return price;
    }


    //E +
    public abstract  int computeDiscount();

}
