import processing.core.PApplet;

public class Ting  {


    private static PApplet p;
    //Tings position
    float x, y;
    float colorR = 0;

    Ting(float inputX, float inputY){

        //Opgave 2: Her skal du skrive kode der sÃ¦tter positionen for tingen x og y
        x = inputX;
        y = inputY;
    }

    void tegn(){
        //Opgave 3: Her skal du skrive kode der tegner denne "Ting"
        Main.p.fill(colorR,0,0);
        Main.p.ellipse(x,y,20,20);
    }

    void flyv(){
        //Opgave 4: Her skal du skrive kode der flytter "Ting"
        //ps: Husk de mÃ¥ ikke flytte sig uden for skÃ¦rmen...
        x += Main.p.randomGaussian()*2;
        y+= Main.p.randomGaussian()*2;
    }



    }



