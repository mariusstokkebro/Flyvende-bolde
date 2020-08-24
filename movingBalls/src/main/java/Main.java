import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet{
    //....Denne variabel kan bruges til at
    static PApplet p;

    //Denne liste SKAL indholde alle de "Ting", der er pÃ¥ skÃ¦rmen!
    Ting[] listeTing = new Ting[20];

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    @Override
    public void settings() {
        super.settings();
        size(500,500);

        //...Alle processing kommandoer er nu inde i p....
        p = this;


        //Opgave 1 : Her skal du oprette listen "listeTing" med plads til 20 ting


        //Opgave 5 : Her skal du skrive kode der laver alle "Ting"
        for (int i = 0; i<listeTing.length; i++) {
            listeTing[i] = new Ting(random(100,300),random(100,300));
        }

    }

    public void draw(){
        //... Eksempel pÃ¥ processing kommando (som den bÃ¸r bruges i andre klasser!!)
        clear();
        Main.p.fill(200,200,200);
        Main.p.rect(10,10,480,480);

        //OPGAVE 8 (SVÃ†R) : Her skal du skrive kode der Ã¦ndrer farven til rÃ¸d din "Ting"  rÃ¸rer ved musen...
        for (int i = 0; i < listeTing.length; i++) {
          if(mouseX > listeTing[i].x-20&&mouseX<listeTing[i].x+20&&mouseY>listeTing[i].y-20&&mouseY<listeTing[i].y+20){
              listeTing[i].colorR = 250;
          }
          else{listeTing[i].colorR = 0;}
        }

            //Opgave 6 : Her skal du skrive kode, der tegner alle "Ting"
        //ps: Du SKAL kalde "tegn metoden" pÃ¥ ALLE "Ting"
        for (int i = 0; i < listeTing.length; i++) {
            listeTing[i].tegn();
            listeTing[i].flyv();
        }


        //Opgave 7 : Her skal du skrive kode, der fÃ¥r alle "Ting" til at flytte sig
        //ps: DU SKAL kalde "





        //EKSPERT 2:
        //Hvis to ting rÃ¸rer hinanden skal de blive blÃ¥!

    }



}
