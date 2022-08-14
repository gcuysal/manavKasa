import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int kg ;

        Scanner inp = new Scanner(System.in);

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        System.out.println("Kaç kg armut istiyorsunuz?: ");
        kg = inp.nextInt();
        double priceArmut = (armut*kg);

        System.out.println("Kaç kg elma istiyorsunuz?: ");
        kg = inp.nextInt();
        double priceElma = (elma*kg);

        System.out.println("Kaç kg domates istiyorsunuz?: ");
        kg = inp.nextInt();
        double priceDomates = (domates*kg);

        System.out.println("Kaç kg muz istiyorsunuz?: ");
        kg = inp.nextInt();
        double priceMuz = (muz*kg);

        System.out.println("Kaç kg patlıcan istiyorsunuz?: ");
        kg = inp.nextInt();
        double pricePatlican = (patlican*kg);

        double totalPrice = (priceArmut+priceElma+priceDomates+priceMuz+pricePatlican);
        System.out.println(totalPrice);





    }
}
