package Zadania.zad3;

import com.sun.org.apache.xpath.internal.SourceTree;

public class TV {

    Boolean isOn;
    int kanal = 1;
    int kanalMax = 9;
    int kanalMin = 1;

    int glosnosc = 8;
    int maxGlosc = 15;
    int minGlosc = 0;

    public String zmienGlosnosc(int zmiana){
        if(isOn==false)
            return "TV is off";
        if (glosnosc + zmiana>= minGlosc && glosnosc + zmiana<= maxGlosc)
        glosnosc += zmiana;
    return "Aktualna glosnosc to: "+glosnosc;
    }

    public String zmienKanal(int zmiana){
        if(isOn==false)
            return "TV is off";
        if (zmiana>= kanalMin && zmiana<= kanalMax)
        kanal = zmiana;
        return "Aktualny kanał: "+kanal;
    }

    public String zmianaIsOn(){
        isOn = !isOn;
        String status = "wyłączanie TV...";
        if(isOn)
            status="włączanie TV...";
        return status;

    }


}
