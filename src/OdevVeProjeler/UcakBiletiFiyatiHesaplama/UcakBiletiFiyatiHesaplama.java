package OdevVeProjeler.UcakBiletiFiyatiHesaplama;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        double perKm = 0.10, childDis = 0.5, teenDis = 0.9, oldDis = 0.7, returnDis = 0.8, price;
        int distance, age, fType;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı giriniz: ");
        age = inp.nextInt();
        System.out.print("Lütfen mesafeyi giriniz (Km): ");
        distance = inp.nextInt();
        System.out.print("Lütfen yolculuk tipini seçiniz:\n" +
                "1-Tek Yön 2-Gidiş-Dönüş\n");
        fType = inp.nextInt();

        price = perKm * distance;
        if (age > 0 && distance > 0 && (fType == 1 || fType == 2)) {

            if (age < 12) {
                price *= childDis;
            } else if (age < 25) {
                price *= teenDis;
            } else if (age > 65) {
                price *= oldDis;
            }

            if (fType==2) {
                    price *= returnDis*2;
            }

            System.out.println("Toplam tutar: " + price + " TL'dir.");
        } else {
            System.out.println("Hatalı veri girişi yaptınız!\nLütfen verilerinizi kontrol edip tekrar deneyiniz.");
        }
    }
}
