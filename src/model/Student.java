package model;

import utils.MyUtils;

public class Student {
    public String name; // def null
    public String lastName; // def null
    public int age;     //def 0
    public double averageGrade;  //def 0.0

    public Student(String nameX, String lastNameX) {
        this.name = nameX;
        this.lastName = lastNameX;
        this.age = MyUtils.getRandomFromRange(18, 65);  // [18, 65]
        this.averageGrade = MyUtils.getRandomFromRange(2, 12);  //[2.0 , 12.0]
    }

    public Student(String name, String lastName, int age, double averageGrade) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public void getOneYearOlder() {
        this.age++;
    }

}
