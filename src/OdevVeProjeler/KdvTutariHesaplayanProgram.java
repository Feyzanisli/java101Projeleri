package OdevVeProjeler;
import java.util.Scanner;
public class KdvTutariHesaplayanProgram {
    public static void main(String[] args){
        double fiyat;
        Scanner urun = new Scanner(System.in);
        System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
        fiyat = urun.nextDouble();

        double kdvTutari18 = fiyat / 100 * 18;
        double kdvArti18 = fiyat + kdvTutari18;

        double kdvTutari8 = fiyat / 100 * 8;
        double kdvArti8 = fiyat + kdvTutari8;

        boolean artiBin = fiyat > 1000;
        String hesap = artiBin ? ("Ürünün KDV Tutarı: " + kdvTutari8) + ("\nÜrünün KDV'li Fiyatı: " + kdvArti8) : ("Ürünün KDV Tutarı: " + kdvTutari18) + ("\nÜrünün KDV'li Fiyatı: " + kdvArti18);
        System.out.println(hesap);
    }
}
