package OdevVeProjeler.DortBesKuvvetleriniYazdiranProgram;

import java.util.Scanner;

public class DortBesKuvvetleriniYazdiranProgram {
    public static void main(String[] args) {
        int userInp;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        userInp = inp.nextInt();

        System.out.println("Girilen sayıya kadar olan 4'ün kuvvetleri şunlardır: ");
        for (int i = 4; i <= userInp; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Girilen sayıya kadar olan 5'in kuvvetleri şunlardır: ");
        for (int i = 5; i <= userInp; i *= 5) {
            System.out.println(i);
        }
    }
}
