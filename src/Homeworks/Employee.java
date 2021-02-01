package Homeworks;

import Lessons.L2Main;

public class Employee {
    public String name;
    public String lastname;
    public int age;
    public int salary;

    public Employee(String name , String lastname , int age, int salary ){
        this.name = name ;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    public static void findMinAge(Employee[] array) {

        int youngest = array[0].age;
        String youngestName = "";
        String youngestSurname = "";
        for (int i = 0; i < array.length-1; i++) {
            System.out.println("age:");
            System.out.println(array[i].age);
            if(array[i].age < youngest) {
                youngest = array[i].age;
                youngestName = array[i].name;
                youngestSurname = array[i].lastname;
            }
        }
        System.out.println("The youngest employee is " + youngest + " of age. " + youngestSurname + ", " + youngestName );
        System.out.println(youngest);

    }

    public static void main(String[] args) {
        Employee[] Emp = new Employee[5];
        Emp[0]= new Employee("Olga", "Ivanova", L2Main.getRandomFromRange(25,55),L2Main.getRandomFromRange(500,1000));
        Emp[1]= new Employee("Maria", "Ivanova2",L2Main.getRandomFromRange(25,55),L2Main.getRandomFromRange(500,1000));
        Emp[2]= new Employee("Ivan", "Ivanova3",L2Main.getRandomFromRange(25,55),L2Main.getRandomFromRange(500,1000));
        Emp[3]= new Employee("Olga", "Ivanova",L2Main.getRandomFromRange(25,55),L2Main.getRandomFromRange(500,1000));

        findMinAge(Emp);
    }

}
