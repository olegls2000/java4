package model.workers;

public class ActionsForSalaries {

    public static AbstractWorker getHighestSalary(AbstractWorker[] array)
    {
        AbstractWorker highestSalary = array[0];
        for (AbstractWorker worker : array)
        {
            if (worker.salary > highestSalary.salary)
            {
                highestSalary = worker;
            }
        }
        return highestSalary;
    }

    public static AbstractWorker getLowestSalary(AbstractWorker[] array)
    {
        AbstractWorker lowestSalary = array[0];
        for (AbstractWorker worker : array)
        {
            if (worker.salary < lowestSalary.salary)
            {
                lowestSalary = worker;
            }
        }
        return lowestSalary;
    }

    public static long getAverageWorkersSalary(AbstractWorker[] array)
    {
        long averageSalary = 0;
        for (AbstractWorker worker : array)
        {
            averageSalary += worker.salary;
        }
        return averageSalary / array.length;
    }

    public static long getAverageManagersSalary(AbstractWorker[] array)
    {
        long averageSalary = 0;
        int sumManagers = 0;
        for (AbstractWorker worker : array)
        {
            if (worker instanceof Manager)
            {
                averageSalary += worker.salary;
                sumManagers++;
            }
        }
        return averageSalary / sumManagers;
    }

    public static long getAveragePerformersSalary(AbstractWorker[] array)
    {
        long averageSalary = 0;
        int sumPerformerss = 0;
        for (AbstractWorker worker : array)
        {
            if (worker instanceof Performer)
            {
                averageSalary += worker.salary;
                sumPerformerss++;
            }
        }
        return averageSalary / sumPerformerss;
    }
}
