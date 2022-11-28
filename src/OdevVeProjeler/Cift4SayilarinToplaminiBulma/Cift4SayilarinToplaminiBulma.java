package OdevVeProjeler.Cift4SayilarinToplaminiBulma;

import java.util.Scanner;

public class Cift4SayilarinToplaminiBulma {
    public static void main(String[] args) {
        double user;
        int total = 0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            user = inp.nextInt();

            if (user % 2 == 0) {
                total += user;
            } else if (user % 4 == 0) {
                total += user;
            }
        } while (user > 0);
        System.out.print("Girdiğiniz değerlerden çift ve 4'ün katları olan sayıların toplamı: " + total + "'dır.");
    }
}