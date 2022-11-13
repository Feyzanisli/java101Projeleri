package OdevVeProjeler.VucutKitleIndexiHesaplayanProgram;
import java.util.Scanner;
public class VucutKitleIndexiHesaplayanProgram {
    public static void main(String[] args) {
        double m, kg, index;

        Scanner olcu = new Scanner(System.in);
        System.out.print("Boyunuzu (metre cinsinde) giriniz: ");
        m = olcu.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kg = olcu.nextDouble();

        index = kg / (m * m);
        System.out.print("Vücut kitle indexiniz: " + index + " 'dir.");
    }
}
