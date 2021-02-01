package homeWork;

import utils.MyUtils;
import model.Worker;

public class HomeWork5Main {

    public static void main(String[] args) {
//Создать отдел (массив людей), наполнить его людьми (5-6 человек),
// и найти самого молодого и самого старого человека.
        Worker w1 = new Worker("Lexa", "Box", MyUtils.getRandomFromRange(18,65), "male", MyUtils.getRandomFromRange(5000,50000));
        Worker w2 = new Worker("Vasilij", "Puskin", MyUtils.getRandomFromRange(18,65), "male", MyUtils.getRandomFromRange(5000,50000));
        Worker w3 = new Worker("Masha", "Gra4", MyUtils.getRandomFromRange(18,65), "female", MyUtils.getRandomFromRange(5000,50000));
        Worker w4 = new Worker("Stas", "Ludoman", MyUtils.getRandomFromRange(18,65), "male", MyUtils.getRandomFromRange(5000,50000));
        Worker w5 = new Worker("Vika", "Sportik", MyUtils.getRandomFromRange(18,65), "female", MyUtils.getRandomFromRange(5000,50000));
        Worker[] workers = {w1, w2, w3, w4, w5,};
        Worker youngest = workers[0];
        Worker older = workers[0];
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].age < youngest.age) {
                youngest = workers[i];
            }
        }
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].age > older.age) {
                older = workers[i];
            }
        }
        System.out.println("Youngest: " + youngest.name);
        System.out.println("Older: " + older.name);
//Посчитать среднюю ЗП сотрудников, найти сотрудника с
// минимальной и максимальной ЗП.
        double averageAge = MyUtils.calculateAverageAge(workers);
        System.out.println("Average age is = " + averageAge);

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].salary < youngest.salary) {
                youngest = workers[i];
            }
        }
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].salary > older.salary) {
                older = workers[i];
            }
        }
        System.out.println("Min salary: " + youngest.name + " " + youngest.salary);
        System.out.println("Max salary: " + older.name + " " + older.salary);
//Вывести в консоль мини отчет о средней ЗП, максимальной и минимальной ЗП,
//среднем возрасте сотрудников, о самом старшем и самом молодом сотруднике.
        double average = MyUtils.calculateAverageSalary(workers);
        System.out.println("Average salary is = " + average);
//Имена, фамилии пол ввести из клавиатуры, возраст случайно сгененрировать из интервала
// 18 … 65 лет, ЗП случайно сгенерировать из интервала 5000 … 50000.



    }

}

