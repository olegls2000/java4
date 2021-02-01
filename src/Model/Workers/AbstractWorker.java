package Model.Workers;

import static Homework.L2Homework.*;
import static Utils.MyUtils.getRandomString;

public abstract class AbstractWorker {
    protected String name;
    protected String surname;
    protected int age;
    protected long salary;

    private String[] names = {"Hans", "Otto", "Hermann", "Karl",
            "Friedrich", "Joseph"};
    private String[] surnames = {"Vagner", "Grimm", "Bormann",
            "Volf", "Hannibal", "Adamson"};

    public AbstractWorker()
    {
        this.name = getRandomString(names);
        this.surname = getRandomString(surnames);
        this.age = getRandomNumberFromRange(18, 65);
        this.salary = getRandomLongNumberFromRange(1500, 45000);
    }

    protected abstract void salaryRecalculate();

    public void getWorkersPortfolio()
    {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}