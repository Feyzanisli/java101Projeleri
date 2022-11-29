package OdevVeProjeler.NninRliKombinasyonu;

import java.util.Scanner;

public class NninRliKombinasyonu {
    public static void main(String[] args) {
        int n, r;
        long nTotal = 1, rTotal = 1, nRTotal = 1, comb;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ilk kümenin eleman sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("Lütfen ikinci kümenin eleman sayısını giriniz: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            nTotal *= i;
        }
        for (int i = 1; i <= r; i++) {
            rTotal *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            nRTotal *= i;
        }

        comb = nTotal / (rTotal * nRTotal);
        System.out.println("İki kümenin  kombinasyonu: " + comb + " 'dır.");
    }
}
