package OdevVeProjeler.Daire;
import java.util.Scanner;
public class DaireDilimAlani {
    public static void main(String[] args) {
        double pi = 3.14 , r , a , alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını cm cinsinden giriniz: ");
        r = input.nextDouble();
        System.out.print("Dairenin hesaplanmasını istediğiniz alanının açısını giriniz: ");
        a = input.nextDouble();

        alan = (pi * (r * r) * a) / 360;
        System.out.println("Dairenin belirlenen diliminin alanı: " + alan + " cm2'dir.");
    }
}

