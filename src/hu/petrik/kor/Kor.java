package hu.petrik.kor;

public class Kor {

    private int x;
    private int y;
    private int sugar;

    public Kor(int x, int y, int sugar) {
        this.x = x;
        this.y = y;
        this.sugar = sugar;
    }
    public  Kor(int n , int j){

        this.x = koordinatagen(n);
        this.y = koordinatagen(n);
        this.sugar = sugargen(j);
    }

    public int getSugar() {
        return sugar;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int koordinatagen(int n) {
        return (int)(Math.random() * ( 2 * n ) + 1) - n;
    }
    private int sugargen(int n) {
        return (int)(Math.random() * ( 2 * n ) + 1) - n;
    }

    public static double getkerulet(int sugara){
        return  (2 * sugara * Math.PI);
    }

    public static double getterulet(int sugar){
        return ((sugar*sugar)*Math.PI);

    }
    public static double getnagyitas(int sugar,int mertek){
        return (sugar*mertek);
    }

    @Override
    public String toString() {
        return "Kor{" +
                "x=" + x +
                ", y=" + y +
                ", sugar=" + sugar +
                '}';
    }
}
