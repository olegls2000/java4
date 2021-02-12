package model;

import annotation.NumberCheck;

public class EqSideTriangle extends AbstractShape {

        @Override
        public double getPerimetr() {
            return 3 * side;
        }

        @Override
        public String toString() {
            return "EqSideTriangle{" +
                    "side=" + side +
                    '}';
        }


}
