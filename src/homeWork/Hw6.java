package homeWork;

import model.Point;
import model.Triangle;

public class Hw6 {
    public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
//
//        Triangle t1 = new Triangle(point1, point2, point3);
//        t1.side1();
//        t1.side2();
//        t1.side3();
//        t1.perimeter();
//        t1.showPerimeter();
//    }
}
