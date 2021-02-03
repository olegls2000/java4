package homework;

import model.*;
import model.workers.Worker;

public class L5Homework {
    public static void main(String[] args) {
        Worker oleg = new Worker(
                "Oleg",
                "Pasechnik", Gender.MALE,
                L2Homework.getRandomNumberFromRange(18, 65),
                L2Homework.getRandomDoubleNumberFromRange(5000.0, 50000.0));
        Worker marek = new Worker(
                "Marek",
                "Raudla", Gender.MALE,
                L2Homework.getRandomNumberFromRange(18, 65),
                L2Homework.getRandomDoubleNumberFromRange(5000.0, 50000.0));
        Worker katerina = new Worker(
                "Katerina",
                "Neznaju", Gender.FEMALE,
                L2Homework.getRandomNumberFromRange(18, 65),
                L2Homework.getRandomDoubleNumberFromRange(5000.0, 50000.0));
        Worker anna = new Worker(
                "Anna",
                "Koshkina", Gender.FEMALE,
                L2Homework.getRandomNumberFromRange(18, 65),
                L2Homework.getRandomDoubleNumberFromRange(5000.0, 50000.0));
        Worker pavel = new Worker(
                "Pavel",
                "Karu", Gender.MALE,
                L2Homework.getRandomNumberFromRange(18, 65),
                L2Homework.getRandomDoubleNumberFromRange(5000.0, 50000.0));

        Worker[] workers = {oleg, marek, katerina, anna, pavel};
        getWorkersAgeSalary(workers);
        System.out.println("\nAverage age is " + getAverageAge(workers));
        getYoungestWorkerAge(workers);
        getOldestWorkerAge(workers);
        System.out.println("\nAverage salary is " + getAverageSalary(workers));
        getLowestWorkersSalary(workers);
        getHighestWorkersSalary(workers);
        System.out.println(katerina.gender.name);
    }
    public static void getWorkersAgeSalary(Worker[] array)
    {
        for (Worker worker : array)
        {
            System.out.println(worker.name + " " + worker.surname +
                    " is " + worker.age +
                    " years old." +
                    " Salary: " + worker.salary);
        }
    }

    public static int getAverageAge(Worker[] array)
    {
        int averageAge = 0;
        for (Worker age : array)
        {
            averageAge += age.age;
        }
        return averageAge / array.length;
    }

    public static void getYoungestWorkerAge(Worker[] array)
    {
        int youngest = array[0].age; //int youngest = Integer.MAX_VALUE;
        String name = array[0].name;
        for (Worker age : array)
        {
            if (age.age < youngest)
            {
                youngest = age.age;
                name = age.name;
            }
        }
        System.out.println("Youngest worker is " + name + ", age: " + youngest + " years old.");
    }

    public static void getOldestWorkerAge(Worker[] array)
    {
        int oldest = array[0].age;
        String name = array[0].name;
        for (Worker age : array)
        {
            if (age.age > oldest)
            {
                oldest = age.age;
                name = age.name;
            }
        }
        System.out.println("Oldest worker is " + name + ", age: " + oldest + " years old.");
    }

    /*public static void getWorkersSalary(Worker[] workers)
    {
        for (Worker worker : workers)
        {
            System.out.println(worker.name + "'s salary is " + worker.salary);
        }
    }*/

    public static double getAverageSalary(Worker[] array)
    {
        int averageSalary = 0;
        for (Worker salary : array)
        {
            averageSalary += salary.salary;
        }
        return averageSalary / array.length;
    }

    public static void getLowestWorkersSalary(Worker[] array)
    {
        double lowestSalary = array[0].salary;
        String name = array[0].name;
        for (Worker salary : array)
        {
            if (salary.salary < lowestSalary)
            {
                lowestSalary = salary.salary;
                name = salary.name;
            }
        }
        System.out.println(name + " has the lowest salary: " + lowestSalary);
    }

    public static void getHighestWorkersSalary(Worker[] array)
    {
        double highestSalary = array[0].salary;
        String name = array[0].name;
        for (Worker salary : array)
        {
            if (salary.salary > highestSalary)
            {
                highestSalary = salary.salary;
                name = salary.name;
            }
        }
        System.out.println(name + " has the highest salary: " + highestSalary);
    }
}