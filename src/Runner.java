import java.lang.reflect.Array;

public class Runner {
    public static void main (String[] args){
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        goodies.print();
        System.out.println(goodies.removeVariety("Chocolate Chip"));
        goodies.print();
        System.out.println("Total Boxes: " + goodies.getTotalBoxes());
    }
}
