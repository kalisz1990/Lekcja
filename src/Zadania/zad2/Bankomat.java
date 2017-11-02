package Zadania.zad2;

//2. Oprogramuj bankomat. Po włączeniu programu niech wyświetla komunikat włóż kartę.

import jdk.nashorn.internal.ir.WhileNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bankomat {

    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int wybor=1;

        System.out.println("włóż karte ");

        // czy karta jest włożona boolean do zrobienia

        Karta card = new Karta(654);


if (card.getPin()) {
    for(;;){
        System.out.println(
                "\nCo chcesz zrobić?\n\n" +
                "1: Sprawdz środki na koncie. \n" +
                "2: Wypłata środków.\n" +
                "3: Zakończ.");

    wybor = scanner.nextInt();
    System.out.println("wybrales: "+wybor);
    if(wybor!=3){

        switch (wybor) {
            case 1:
                card.getStanKata();
                break;
            case 2:
                card.getIle();
                break;
            default:
            System.out.print("Zly wybor, wybierz ponownie.");
               break;}
    }
    else{System.out.println("Zamykanie"); break;}
    }

}
    }

}
