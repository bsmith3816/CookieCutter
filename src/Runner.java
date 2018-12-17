import java.util.Arrays;

public class Runner {
    public static void main (String[] args){
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        System.out.println(Arrays.toString(goodies));
        System.out.println(goodies.removeVariety("Chocolate Chip"));
        System.out.println(Arrays.toString(goodies));
    }
}
