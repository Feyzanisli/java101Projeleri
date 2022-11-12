package Hipotenus;
import java.util.Scanner;
public class UcgenAlaniHesaplayanProgram {
    public static void main(String[] args){
        double k1, k2, k3, uznlk, alan;
        Scanner kenar = new Scanner(System.in);
        System.out.print("Üçgenin 1. kenar uzunluğunu giriniz: ");
        k1 = kenar.nextDouble();
        System.out.print("Üçgenin 2. kenar uzunluğunu giriniz: ");
        k2 = kenar.nextDouble();
        System.out.print("Üçgenin 3. kenar uzunluğunu giriniz: ");
        k3 = kenar.nextDouble();

        uznlk = (k1 + k2 + k3) / 2;
        alan = Math.sqrt(uznlk * (uznlk - k1) * (uznlk - k2) * (uznlk - k3));
        System.out.print("Üçgenin alanı: " + alan);
    }
}
