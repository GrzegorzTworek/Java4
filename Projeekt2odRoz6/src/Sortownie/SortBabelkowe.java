package Sortownie;

import java.util.Scanner;

public class SortBabelkowe {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe elementów tablicy ");
        int n = in.nextInt();
        int[] tab = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Podaj element o indeksie " + i +": ");
            tab[i]=in.nextInt();
        }
        System.out.println("Wprowadzona tablica: |");
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i] + " | ");
        }
        int zmiany =1;
        int próba;
        int pomoc;

       /* while(zmiany!=0){
            próba=0;
            zmiany =0;
            while (próba!=tab.length-1){
                if(tab[próba]<tab[próba+1]){
                    zmiany++;
                    pomoc=tab[próba +1];
                    tab[próba +1]=pomoc;
                }
                próba++;
            }
        }
        */
        for (int i= 0; i<tab.length; i++){
            for(int j =1; j<tab.length; j++) {
                if (tab[j-1] > tab[j]) {
                    int wieksza = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = wieksza;
                }
            }
        }
        in.close();
        System.out.println();
        System.out.println("Posortowana tablica: |");
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i] + " | ");
        }

    }
}
