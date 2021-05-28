package Sortownie;

import java.util.Scanner;

public class SortPrzezWstawianie {

    private static void printArray(int[] tab){
        System.out.println();
        for(int i = 0; i<tab.length; i++){
            System.out.print(tab[i] + " | " );
        }
        System.out.println();
    }
    private static void insertionSort(int[] tab){
        for (int x =1; x<tab.length; x++){
            //Wybieramy element który chcemy porównać
            int selectedElement = tab[x];
            int y;

            //Rozpoczynamy przesuwanie elementów szukają miejsca doceloweego
            //dla wybracengo przez nas elemenu
            for (y = x-1; (y>=0) && (selectedElement< tab[y]); y--){
                tab[y + 1] = tab[y];
            }

            System.out.println("\nKrok " + (x-1) +  ": Przenoszenie elementu " + selectedElement + " z pozycji " + x + " na pozycje " + (y+1));
            tab[y+1] = selectedElement;
            printArray(tab);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // incjalizujemy Scanner - obiekt pozwalający na wczytywanie danych
        System.out.println("Wprowadz liczbe elemntow tablicy: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for( int i = 0; i<n; i++){
            System.out.println("Podaj element nr. " + i + ": ");
            arr[i] = sc.nextInt(); //wczytujemy kolejne elenty tablicy
        }
        System.out.println("Oto wprowadzona tavlica: ");
        printArray(arr);
        insertionSort(arr);
        System.out.println("Oto wprowadzoan tablica po przesortowaniu: ");
        printArray(arr);
        sc.close(); //zwalniamy zasoby


    }
}
