package OdevVeProjeler.ArtikYilHesaplama;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen hesaplanacak yılı giriniz: ");
        year = inp.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " bir artık yıldır.");
                } else {
                    System.out.println(year + " bir artık yıl değildir.");
                }
            }else {
                System.out.println(year + " bir artık yıldır.");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
