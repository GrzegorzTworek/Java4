package Silnia;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] argas) {
        Scanner in = new Scanner(System.in);

        System.out.print("Podaj liczbe do silni ");
        int k = in.nextInt();
        if (k < 0) {
            System.out.print("Nie można policzyć silni z liczby ujemnej");
        }
        else  {
            int wynik = 1;

            for (int i = 1; i <= k; i++) {
                wynik *= (k - i + 1);

            }
            System.out.print("Silnia wynosi " + wynik);

        }
    }
}
