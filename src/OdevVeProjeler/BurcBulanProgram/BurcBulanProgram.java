package OdevVeProjeler.BurcBulanProgram;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        int day, month;
        String horoscope = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz ay (sayı cinsinden): ");
        month = inp.nextInt();
        System.out.print("Doğduğunuz gün (sayı cinsinden): ");
        day = inp.nextInt();

        if (month == 1 && 0 < day && day < 32) {
            if (day < 22) {
                horoscope = "Oğlak";
            } else {
                horoscope = "Kova";
            }
        } else if (month == 2 && 0 < day && day < 30) {
            if (day < 21) {
                horoscope = "Kova";
            } else {
                horoscope = "Balık";
            }
        } else if (month == 3 && 0 < day && day < 32) {
            if (day < 21) {
                horoscope = "Balık";
            } else {
                horoscope = "Koç";
            }
        } else if (month == 4 && 0 < day && day < 31) {
            if (day < 21) {
                horoscope = "Koç";
            } else {
                horoscope = "Boğa";
            }
        } else if (month == 5 && 0 < day && day < 32) {
            if (day < 22) {
                horoscope = "Boğa";
            } else {
                horoscope = "İkizler";
            }
        } else if (month == 6 && 0 < day && day < 31) {
            if (day < 23) {
                horoscope = "İkizler";
            } else {
                horoscope = "Yengeç";
            }
        } else if (month == 7 && 0 < day && day < 32) {
            if (day < 23) {
                horoscope = "Yengeç";
            } else {
                horoscope = "Aslan";
            }
        } else if (month == 8 && 0 < day && day < 32) {
            if (day < 23) {
                horoscope = "Aslan";
            } else {
                horoscope = "Başak";
            }
        } else if (month == 9 && 0 < day && day < 31) {
            if (day < 23) {
                horoscope = "Başak";
            } else {
                horoscope = "Terazi";
            }
        } else if (month == 10 && 0 < day && day < 32) {
            if (day < 23) {
                horoscope = "Terazi";
            } else {
                horoscope = "Akrep";
            }
        } else if (month == 11 && 0 < day && day < 31) {
            if (day < 22) {
                horoscope = "Akrep";
            } else {
                horoscope = "Yay";
            }
        } else if (month == 12 && 0 < day && day < 32) {
            if (day < 22) {
                horoscope = "Yay";
            } else {
                horoscope = "Oğlak";
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Tarih bilgilerini hatalı girdiniz!\n" +
                    "Lütfen tekrar deneyin.");
        } else {
            System.out.println("Burcunuz: " + horoscope + " 'dir.");
        }
    }
}
