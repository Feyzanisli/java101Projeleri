package OdevVeProjeler.HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sayıların toplamı: " + (n1 + n2) + " 'dir.");
                break;
            case 2:
                System.out.println("Sayıların farkı:" + (n1 - n2) + " 'dir.");
                break;
            case 3:
                System.out.println("Sayıların çarpımı: " + (n1 * n2) + " 'dir.");
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Sayıların bölümü: " + (n1 / n2) + " 'dir.");
                } else
                    System.out.println("Bir sayı 0'a bölünemez!");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");

        }

    }
}
