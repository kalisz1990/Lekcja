package Zadania.zad3;

import com.sun.org.apache.xpath.internal.SourceTree;

public class TV {

    Boolean isOn;
    int kanal;
    int glosnosc;
    int maxGlosc = 15;
    int minGlosc = 0;

    public String zmienGlosnosc(int zmiana){
        if(isOn==false)
            return "TV is off";
        if (glosnosc + zmiana>= minGlosc && glosnosc + zmiana<= maxGlosc)
        glosnosc = +zmiana;
    return "Aktualna glosnosc to: "+glosnosc;
    }

    public String zmienKanal(int zmiana){
        if(isOn==false)
            return "TV is off";
        kanal = zmiana;
        return "Aktualny kanał: "+kanal;
    }

    public String zmianaIsOn(){
        isOn = !isOn;
        String status = "wyłączony";
        if(isOn)
            status="włączony";
        return "TV jest " + status;

    }


}
