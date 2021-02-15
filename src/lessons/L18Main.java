package lessons;

import collection.MyQueue;
import model.Circle;

import java.util.Queue;

//Collection Queue Implementation
public class L18Main {
    public static void main(String[] args) {
        Queue<Circle> myQueue = new MyQueue<>();
        Circle circle1 = new Circle();
        myQueue.add(circle1);

        Circle circle2 = new Circle();
        myQueue.add(circle2);

        Circle circle3 = new Circle();
        myQueue.add(circle3);

        System.out.println("My Queue: " + myQueue);
        myQueue.remove(circle2);

        System.out.println("My Queue: " + myQueue);


    }
}
