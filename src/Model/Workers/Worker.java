package Model.Workers;

import Model.Gender;

public class Worker {
    public String name;
    public String surname;
    public Gender gender;
    public int age;
    public double salary;

    public Worker(String name, String surname, Gender gender, int age, double salary)
    {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }
}