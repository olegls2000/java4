package model;

    public class Circle extends AbstractShape {

        @Override
        public double getPerimetr() {
            return Math.PI * side;
        }

        public void printFromCircle(){
            System.out.println("Hello from Circle!!!!!");
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "side=" + side +
                    '}';
        }

        @Override
        public int hashCode() {
            return side;
        }
    }


