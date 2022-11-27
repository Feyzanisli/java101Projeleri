package OdevVeProjeler.CinZodyagi;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        int birthY, zCalc;
        String zSign = "";

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen doğum yılınızı girin: ");
        birthY = inp.nextInt();

        zCalc = birthY % 12;
        switch (zCalc) {
            case 0:
                zSign = "Maymun";
                break;
            case 1:
                zSign = "Horoz";
                break;
            case 2:
                zSign = "Köpek";
                break;
            case 3:
                zSign = "Domuz";
                break;
            case 4:
                zSign = "Fare";
                break;
            case 5:
                zSign = "Öküz";
                break;
            case 6:
                zSign = "Kaplan";
                break;
            case 7:
                zSign = "Tavşan";
                break;
            case 8:
                zSign = "Ejderha";
                break;
            case 9:
                zSign = "Yılan";
                break;
            case 10:
                zSign = "At";
                break;
            case 11:
                zSign = "Koyun";
                break;
        }
        System.out.println("Çin zodyağına göre burcunuz: " + zSign + " 'dır.");
    }
}
