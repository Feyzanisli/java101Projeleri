package OdevVeProjeler.UsluSayiHesaplayanProgram;

import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        int base, exponent, total = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen taban sayıyı giriniz: ");
        base = inp.nextInt();
        System.out.print("Lütfen üs sayıyı giriniz: ");
        exponent = inp.nextInt();

        for (int i = 1; i <= exponent; i++) {
            total *= base;
        }

        System.out.println(base + " üssü " + exponent + ", " + total + " 'e eşittir");
    }
}
