package hu.petrik.pontoop.pont;

import hu.petrik.helloworld_rk.Main;

public class Point {

    private int x;
    private int y;

    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int x , int y)
    {
        this.x = x;
        this.y = y;
    }

    public  Point(int n){

        this.x = koordinatagen(n);
        this.y = koordinatagen(n);
    }

    private int koordinatagen(int n) {
        return (int)(Math.random() * ( 2 * n ) + 1) - n;
    }

    public double getOrigotav(){
        return Math.sqrt((Math.pow(this.x , 2) + Math.pow(this.y , 2)));
    }
    public static double getponttav(Point p1 , Point p2){
        return Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x) );
    }

    public static double getsiknegyed(Point p1)
    {
        if (p1.x > 0 && p1.y > 0){
            return 4;
        }
        else if (p1.x > 0 && p1.y < 0){
            return 3;
        }
        else if (p1.x < 0 && p1.y > 0){
            return 1;
        }
        else if (p1.x < 0 && p1.y < 0){
            return 2;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
