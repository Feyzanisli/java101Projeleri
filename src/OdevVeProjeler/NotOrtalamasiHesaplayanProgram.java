package OdevVeProjeler;
import java.util.Scanner;
public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args){
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner not = new Scanner (System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = not.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = not.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = not.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = not.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = not.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = not.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);

        boolean kosul = sonuc >= 60;
        String karne = kosul ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
        System.out.print(karne);
    }
}
