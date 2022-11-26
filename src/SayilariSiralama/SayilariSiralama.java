package SayilariSiralama;

import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayı: ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayı: ");
        n2 = inp.nextInt();
        System.out.print("Üçüncü sayı: ");
        n3 = inp.nextInt();

        if ((n1 > n2) && (n1 > n3)) {
            System.out.print(n1 + " > ");
            if (n2 > n3) {
                System.out.print(n2 + " > " + n3);
            } else {
                System.out.print(n3 + " > " + n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            System.out.print(n2 + " > ");
            if (n3 > n1) {
                System.out.print(n3 + " > " + n1);
            } else {
                System.out.print(n1 + " > " + n3);
            }
        } else {
            System.out.print(n3 + " > ");
            if (n2 > n1) {
                System.out.print(n2 + " > " + n1);
            } else {
                System.out.print(n1 + " > " + n2);
            }
        }
    }
}
