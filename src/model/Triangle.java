package model;

import java.util.*;


public class Triangle {

    /*
    // find the distance between two points method
    public static double getDistance( Point pointA, Point pointB) {
        double squaredX;
        double squaredY;

        //find which is bigger x1 or x2, subract and pow the result
        if(pointA.x < pointB.x) {
            squaredX = Math.pow(pointB.x - pointA.x,2);
        } else {
            squaredX = Math.pow(pointA.x - pointB.x,2);
        }

        //find which is bigger y1 or y2, subract and pow the result
        if(pointA.y < pointB.y) {
            squaredY = Math.pow(pointB.y - pointA.y,2);
        } else {
            squaredY = Math.pow(pointA.y - pointB.y,2);
        }

        // return the square root of x + y
        return Math.sqrt(squaredX + squaredY);
    }
    */
    public static double getPerimiter(double ab, double bc, double ac) {
        return ab + bc + ac;
    }


    public static void main(String args[]){

        Scanner con = new Scanner(System.in);

        Point pointA = new Point(0, 0);
        Point pointB = new Point(3, 6);
        Point pointC = new Point(6, 2);

        double ab = pointA.getDistance(pointB);
        double bc = pointB.getDistance(pointC);
        double ac = pointA.getDistance(pointC);

        /*
        double ab = getDistance(pointA, pointB);
        double bc = getDistance(pointB, pointC);
        double ac = getDistance(pointA, pointC);
        */

        System.out.println("The triangle perimiter is:");
        double perimiter = getPerimiter(ab,bc,ac);
        System.out.println(perimiter);

    }

}



