package hu.petrik.helloworld_rk;

import hu.petrik.pontoop.pont.Point;

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
    }
}
