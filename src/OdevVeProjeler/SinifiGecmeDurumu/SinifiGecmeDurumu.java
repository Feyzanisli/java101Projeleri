package OdevVeProjeler.SinifiGecmeDurumu;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik, avarage, totalGrade = 0;
        int counter = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextDouble();
        if (0 > mat || 100 < mat) {
            System.out.println("Hatalı not girişi! Ortalamanıza dahil edilmeyecektir.");
        } else {
            totalGrade += mat;
            counter += 1;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextDouble();
        if (0 > fizik || 100 < fizik) {
            System.out.println("Hatalı not girişi! Ortalamanıza dahil edilmeyecektir.");
        } else {
            totalGrade += fizik;
            counter += 1;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextDouble();
        if (0 > turkce || 100 < turkce) {
            System.out.println("Hatalı not girişi! Ortalamanıza dahil edilmeyecektir.");
        } else {
            totalGrade += turkce;
            counter += 1;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextDouble();
        if (0 > kimya || 100 < kimya) {
            System.out.println("Hatalı not girişi! Ortalamanıza dahil edilmeyecektir.");
        } else {
            totalGrade += kimya;
            counter += 1;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextDouble();
        if (0 > muzik || 100 < muzik) {
            System.out.println("Hatalı not girişi! Ortalamanıza dahil edilmeyecektir.");
        } else {
            totalGrade += muzik;
            counter += 1;
        }

        avarage = totalGrade / counter;

        System.out.println("Ortalamanız: " + avarage);
        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        } else {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }
    }
}
