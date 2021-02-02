
package model;

public class Worker {
//Класс Worker имеет  поля возраст, имя, фамилия, пол, зарплата.
    public Integer age;
    public String name;
    public String surName;
    public String gender;
    public Integer salary;

    public Worker(String name,String surName,Integer age,String gender,Integer salary) {
        this.age = age;
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.salary = salary;

    }
    public Worker() {
        }
    public int calculateSalary(){
        return this.salary;
    }
    public int calculateAge(){
        return this.age;
    }


}



