package OdevVeProjeler;
import java.util.Scanner;

public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args){
        double kenar1, kenar2, hipo;
        Scanner a = new Scanner(System.in);
        System.out.print("Dik kenar uzunluklarından 1.sini giriniz: ");
        kenar1 = a.nextDouble();
        System.out.print("Dik kenar uzunluklarından 2.sini giriniz: ");
        kenar2 = a.nextDouble();

        hipo = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.print("Dik üçgenin hipotenüs uzunluğu: " + hipo);
    }
}
