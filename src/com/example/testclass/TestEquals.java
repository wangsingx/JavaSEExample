package com.example.testclass;

/**
 * Created by wangxing on 2015/11/27.
 */
class Point{
    int x;
    int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
public class TestEquals {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(4, 5);
        Point p4 = p1;

        System.out.println("p1 == p1: " + (p1 == p1));
        System.out.println("p1.equals(p1): " + (p1.equals(p1)));
        System.out.println("p1 == p2: " + (p1 == p2));
        System.out.println("p1.equals(p2): " + (p1.equals(p2)));
        System.out.println("p1 == p3: " + (p1 == p3));
        System.out.println("p1.equals(p3): " + (p1.equals(p3)));
        System.out.println("p1 == p4: " + (p1 == p4));
        System.out.println("p1.equals(p4): " + (p1.equals(p4)));
    }
}
