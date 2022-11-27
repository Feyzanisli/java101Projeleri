package OdevVeProjeler.GirilenSayilardanCiftSayiBulma;

import java.util.Scanner;

public class GirilenSayilardanCiftSayiBulma {
    public static void main(String[] args) {
        int user, i = 1;
        double avarage, total = 0, counter = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        user = inp.nextInt();

        while (i < user) {
            if (i % 3 == 0) {
                total += i;
                counter++;
                i++;
            } else if (i % 4 == 0) {
                total += i;
                counter++;
                i++;
            } else {
                i++;
            }
        }
        avarage = total / counter;
        System.out.println("Girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: "
                + avarage + " 'dır.");

    }
}
