package Sortownie;

import java.util.Scanner;

public class sor {
    public static void main(String[] args){
        Scanner inn = new Scanner(System.in);
        System.out.println("Enter number of elemnts to be sorted ");
        int k = inn.nextInt();
        int [] tab = new int[k];
        System.out.println("Enter the numbers ");
        for (int i=0;i<k;i++){
            System.out.println("enter number " + i );
             tab[i] = inn.nextInt();

            }
        System.out.println("Input array");
        for(int i=0; i<tab.length;i++){
            System.out.print(tab[i] + " | ");
        }

        for(int i=0; i<tab.length;i++){
            for(int j=1;j<tab.length;j++){
                if(tab[j]< tab[j-1]){
                    int higher = tab[j-1];
                    tab[j-1]= tab[j];
                    tab[j] = higher;
                }
            }
        }
        inn.close();
        System.out.println("Drukuj tablice ");
        for(int i=0; i<tab.length;i++){
            System.out.print(tab[i] + " | ");
        }
    }
}
