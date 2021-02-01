package model;

public interface Shape /*extends SuperInterface*/ {

    public static final  int INTERFACE_FIELD = 100;

    default double calculatePerimetr() {
        return 12.0;
    }

    double calculateArea();

    void printInfo();

}
