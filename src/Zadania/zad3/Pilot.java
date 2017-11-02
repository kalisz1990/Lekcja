package Zadania.zad3;
/*
3. Oprogramuj pilot do telewizora, niech naciśnięcie danego przycisku wywołuje jakąś metodę.
        Program po uruchomieniu ma wyświetlić liczbę dostępnych przycisków, a po naciśnięciu danego przycisku
        (czyli wpisaniu jego nazwy) komunikat. Pilot niech ma przyciski numeryczne, ale maksymalna wartość,
        jaką można wpisać to 9. Niech ma przycisk on/off, pozostałe przyciski nie działają, kiedy TV jest wyłączony.
        Niech posiada regulację głośności (minimum 1, maksimum 15) i przycisk zmiany kanału w górę, a także w dół.
        Kanały niech będą zapętlone, z kolei głośność nie. Kończenie pracy programu po wyłączeniu telewizora.
        UWAGA! Przypominam, że do porównywania tekstu używamy metody equals.
        */

import java.util.Scanner;

public class Pilot {

    public static void main (String []args){
       int [] przyciski = {1,2,3,4,5,6,7,8,9};
       boolean off;

       funkcje wlacz = new funkcje();
       funkcje glos = new funkcje();
       Scanner scanner = new Scanner (System.in);
int dupa =0;
System.out.print("czy chcesz uruchomić pilota? (true/false): ");
       wlacz.setOnOff(scanner.nextBoolean());
       //while(ge)
       System.out.println("glosniej/ciszej (up/down): ");
       glos.setGlosnosc(scanner.next());




    }
}
