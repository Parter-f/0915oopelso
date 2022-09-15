package hu.petrik.helloworld_rk;

import hu.petrik.pontoop.pont.Point;
import korfeladat.Kor;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(0 ,0);
        Point p2 = new Point(0 , 0);
        Point p3 = new Point(3,4);
        Point p4 = new Point(100);

        Point[] pontok = new Point[10];
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        for (int i = 0; i < pontok.length; i++) {

            pontok[i] = new Point(100);

        }
        for (Point point : pontok) {

            System.out.println(point);
        }
        int legtavolabb = 0;
        for (int i = 0; i < pontok.length; i++) {

        if (pontok[i].getOrigotav() > pontok[legtavolabb].getOrigotav())
            legtavolabb = i;
        }
        System.out.println("legtávolabbi pont és távolsága");
        System.out.println(pontok[legtavolabb]);
        System.out.println(pontok[legtavolabb].getOrigotav());
        Point p5 = new Point(-10 , 10);
        Point p6 = new Point(2 , 15);

        System.out.println(p5 + " " + p6);
        System.out.println(Point.getponttav(p5 , p6));
        System.out.println(Point.getsiknegyed(p5));


        Kor k18 = new Kor(5 , 6 ,4);
        System.out.println(Kor.getkerulet(k18.getSugar()));
        System.out.println(Kor.getterulet(k18.getSugar()));
        System.out.println(k18.getX() + " " + k18.getY() + " " + Kor.getnagyitas(k18.getSugar(), 2));
        System.out.println(k18);

        Kor[] korok = new Kor[10];
        for (int i = 0; i < korok.length ; i++) {
            korok[i] = new Kor(10 ,15);
        }
        for (Kor kor : korok) {
            System.out.println(kor);
        }

        int legnagyobbterulet = 0;
        for (int i = 0; i < korok.length; i++) {

            if (Kor.getterulet(korok[i].getSugar()) > Kor.getterulet(korok[legnagyobbterulet].getSugar()) ){
                legnagyobbterulet = i;
            }
        }
        System.out.println("A legnagyobb területü kör : " + korok[legnagyobbterulet]);

    }
}
