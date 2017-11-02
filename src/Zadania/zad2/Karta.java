package Zadania.zad2;
import java.util.Scanner;

public class Karta {
    private int pin = 1234;
    public int stanKata;
    private int ile;

    Scanner scanner = new Scanner(System.in);

    public boolean getPin() {
        int pin2;
        boolean exit = true;

        for (int i=2; i>=0; i--){
            System.out.print("podaj pin: (1234)");
            pin2 = scanner.nextInt();
            if (pin == pin2){
                System.out.println("Pin Poprawny\n");
                 break;
            }
            else{
                System.out.println("zly pin, pozostało prob "+ i);
                if(i==0) {
                    System.out.println("karta zablokowana");
                    exit = false;
                }
            }
        }
    return exit;
    }

    public void getStanKata(){
        System.out.println("Stan kąta: "+ stanKata+" zl"+"\n");
    }

    public int getIle() {

        System.out.print("Ile chcesz wyplacic, podaj liczbe: ");
        ile = scanner.nextInt();
        stanKata -=ile;
        ile=0;
        getStanKata();

        return stanKata;

    }
    }



