package OdevVeProjeler.ManavKasaProgrami;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args){
        double tutar, armutK = 2.14 , armut,  elmaK = 3.67 , elma, domatsK = 1.11 , domats,  muzK = 0.95 , muz,  patlcnK = 5 , patlcn;

        Scanner kasa = new Scanner(System.in);
        System.out.print("Armut miktarı (kg) giriniz: ");
        armut = kasa.nextDouble();
        System.out.print("Elma miktarı (kg) giriniz: ");
        elma =  kasa.nextDouble();
        System.out.print("Domates miktarı (kg) giriniz: ");
        domats = kasa.nextDouble();
        System.out.print("Muz miktarı (kg) giriniz: ");
        muz = kasa.nextDouble();
        System.out.print("Patlıcan miktarı (kg) giriniz: ");
        patlcn = kasa.nextDouble();

        tutar = (armutK * armut) + (elmaK * elma) + (domatsK * domats) + (muzK * muz) + (patlcnK * patlcn);
        System.out.println("Toplam tutar: " + tutar + " TL'dir.");
    }
}
