package OdevVeProjeler.BasamakSayilariToplami;

import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();

        int digitNum, total = 0;
        while (number != 0) {
            digitNum = number % 10;
            total += digitNum;
            number = number / 10;
        }
        System.out.println("Sayının basamak sayılarının toplamı: " + total + "'dır.");
    }
}

