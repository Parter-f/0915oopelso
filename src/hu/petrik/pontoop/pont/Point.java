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

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
