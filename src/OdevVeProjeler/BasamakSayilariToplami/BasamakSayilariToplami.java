package OdevVeProjeler.BasamakSayilariToplami;

import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();

        int nmbr = number, digitCount = 0, digitNum, total = 0;

        while (nmbr != 0) {
            nmbr /= 10;
            digitCount++;
        }

        for (int i = 1; i <= digitCount; i++) {
            digitNum = number % 10;
            total += digitNum;
            number = number / 10;
        }

        System.out.println("Sayının basamak sayılarının toplamı: " + total + "'dır.");
    }
}
