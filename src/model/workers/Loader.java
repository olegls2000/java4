package model.workers;

import static model.workers.ActionsForSalaries.*;

public class Loader {
    public static void main(String[] args) {
        AbstractWorker[] workers = {new Director(),
                new DepartmentHead(),
                new Programmer(),
                new Tester()};

        for (AbstractWorker worker : workers)
        {
            worker.getWorkersPortfolio();
        }

        AbstractWorker maxSal = getHighestSalary(workers);
        AbstractWorker minSal = getLowestSalary(workers);
        System.out.println();
        System.out.println(maxSal.name + " " + maxSal.surname + " has highest salary: " + maxSal.salary);
        System.out.println(minSal.name + " " + minSal.surname + " has lowest salary: " + minSal.salary);
        System.out.println("Average Worker's salary: " + getAverageWorkersSalary(workers));
        System.out.println("Average Manager's salary: " + getAverageManagersSalary(workers));
        System.out.println("Average Performer's salary: " + getAveragePerformersSalary(workers));
    }
}
