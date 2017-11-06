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

import java.awt.*;
import java.util.Scanner;

public class Pilot {

    public static void main(String[] args) {
        Scanner guzik = new Scanner(System.in);
        TV Sony = new TV();

        System.out.print("wcisnij O by uruchomić TV: ");
        String on = guzik.next();

        if ((on.equals("o")) || (on.equals("O"))) {
            Sony.isOn = false;
            Sony.zmianaIsOn();
        } else
            System.out.println(Sony.zmianaIsOn());

                System.out.println("Wcisnij guzik: \n" +
                        "Programy: 1,2,3,4,5,6,7,8,9\n" +
                        "Głosność: +,- \n" +
                        "Zmiana kanału w tyl/przod: p,n\n" +
                        "Wyłącz TV: O\n");

                while (Sony.isOn) {

                String button = guzik.next();
                switch (button) {
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                        System.out.println(Sony.zmienKanal(button));
                        break;
                    case "+":
                        System.out.println(Sony.zmienGlosnosc(1));
                        break;
                    case "-":
                        System.out.println(Sony.zmienGlosnosc(-1));
                        break;
                    case "o":
                    case "O":
                        System.out.println(Sony.zmianaIsOn());
                        break;
                    case "n":
                    case "p":
                        System.out.println();
                        break;
                    default:
                        System.out.println("zły przycisk");
                        break;
                }

                }
    }
}
