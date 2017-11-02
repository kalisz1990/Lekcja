package Zadania.zad3;

public class funkcje {
    private boolean onOff=false;
    private int glosnosc=10;

    public void setOnOff(boolean a){
        onOff = a;
    }
    public void getOnOff() {

        if (onOff) {
            System.out.println("TV is on");
        } else
            System.out.println("pilot wylaczony");
    }

        public void setGlosnosc(String up) {
            if (up.equals("up")) {
                glosnosc++;
                System.out.println("glosnosc = "+glosnosc);
            } else if(up.equals("down")) {
                glosnosc--;
                System.out.println("glosnosc = "+glosnosc);}
            else
                System.out.println("zly przycisk");
            }

    public int getGlosnosc() {
        this.glosnosc = glosnosc;

        return glosnosc;
    }
}


