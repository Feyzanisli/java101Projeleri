package OdevVeProjeler;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args){
        double km, kmBrm =  2.20, yolTutari;
        int acilis = 10 , min =20;

        Scanner yol = new Scanner(System.in);
        System.out.print("Katedilen KM uzunluğunu giriniz: ");
        km = yol.nextDouble();

        yolTutari = (km * kmBrm) + acilis;

        boolean indiBindi = yolTutari < min;
        String taksimetre = indiBindi ? ("Borcunuz: 20 TL'dir.")  : ("Borcunuz: " + yolTutari + "TL'dir.");
        System.out.println(taksimetre);
    }
}
