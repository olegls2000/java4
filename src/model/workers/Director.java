package model.workers;

import static utils.MyUtils.getRandomString;

public class Director extends Manager {
    private String[] directorateNames = {"Маркетинг", "Проектная"};
    private String dirName;

    public Director()
    {
        this.dirName = getRandomString(directorateNames);
    }

    @Override
    protected void salaryRecalculate()
    {
        super.salaryRecalculate();
        salary += 1500;
    }

    @Override
    public void getWorkersPortfolio()
    {
        super.getWorkersPortfolio();
        System.out.println("Directorate name: " + dirName);
    }
}