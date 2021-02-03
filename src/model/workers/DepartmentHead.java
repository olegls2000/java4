package model.workers;

import static utils.MyUtils.getRandomString;

public class DepartmentHead extends Manager {
    private String[] departmentNames = {"Первый-отдел",
            "Второй-отдел", "Третий-отдел"};
    private String depName;

    public DepartmentHead()
    {
        this.depName = getRandomString(departmentNames);
    }

    @Override
    public void salaryRecalculate()
    {
        super.salaryRecalculate();
        salary += 750;
    }

    @Override
    public void getWorkersPortfolio()
    {
        super.getWorkersPortfolio();
        System.out.println("Department name: " + depName);
    }
}