package OdevVeProjeler.HarmonikSeri;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        int number;
        double total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();

        for (double i = 1; i <= number; i++) {
            total += (1 / i);
        }
        System.out.println(number + " 'in harmonik seri toplamı: " + total + " 'dir.");
    }
}
