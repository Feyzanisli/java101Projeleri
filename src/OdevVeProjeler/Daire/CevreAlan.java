package OdevVeProjeler.Daire;
import java.util.Scanner;

public class CevreAlan {
    public static void main(String[] args){
        double r, pi = 3.14, alan, cevre ;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını cm cinsinden giriniz: ");
        r = input.nextDouble();

        alan = pi * r * r ;
        cevre = 2 * pi * r ;

        System.out.println("Dairenin alanı: " + alan + " cm2'dir." );
        System.out.println("Dairenin çevresi: " + cevre + " cm'dir.");
    }
}
