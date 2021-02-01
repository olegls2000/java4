package Model.Workers;

import static Utils.MyUtils.getRandomString;

public class Tester extends Performer {
    private String[] projectNames = {"UBS", "Pentagon", "NASA"};
    private String projName;

    public Tester()
    {
        this.projName = getRandomString(projectNames);
    }

    @Override
    public void salaryRecalculate() {};

    @Override
    public void getWorkersPortfolio()
    {
        super.getWorkersPortfolio();
        System.out.println("Project: " + projName);
    }
}