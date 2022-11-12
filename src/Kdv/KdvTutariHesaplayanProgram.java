package Kdv;
import java.awt.*;
import java.util.Scanner;
public class KdvTutariHesaplayanProgram {
    public static void main(String[] args){
        double fiyat;

        Scanner urun = new Scanner(System.in);
        System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
        fiyat = urun.nextDouble();

        double kdvtutari18 = fiyat / 100 * 18;
        double kdvarti18 = fiyat + kdvtutari18;

        double kdvtutari8 = fiyat / 100 * 8;
        double kdvarti8 = fiyat + kdvtutari8;

        boolean artibin = fiyat > 1000;
        String hesap = artibin ? ("Ürünün KDV Tutarı: " + kdvtutari8) + ("\nÜrünün KDV'li Fiyatı: " + kdvarti8) : ("Ürünün KDV Tutarı: " + kdvtutari18) + ("\nÜrünün KDV'li Fiyatı: " + kdvarti18);
        System.out.println(hesap);
    }
}
