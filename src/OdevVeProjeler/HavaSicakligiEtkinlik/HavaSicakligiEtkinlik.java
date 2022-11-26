package OdevVeProjeler.HavaSicakligiEtkinlik;

import java.util.Scanner;

public class HavaSicakligiEtkinlik {
    public static void main(String[] args) {
        int temp;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        temp = inp.nextInt();

        if (temp < 5) {
            System.out.println("Kayağı değerlendirebilirsiniz.");
        } else if (temp < 15) {
            System.out.println("Sinemayı değerlendirebilirsiniz.");
        } else if ( temp < 25) {
            System.out.println("Pikniği değerlendirebilirsiniz.");
        } else {
            System.out.println("Yüzmeyi değerlendirebilirsiniz.");
        }
    }
}

