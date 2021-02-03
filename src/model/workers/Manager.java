package model.workers;

public abstract class Manager extends AbstractWorker {
    private String manager = "Manager";

    public Manager()
    {
        this.manager = manager;
        salaryRecalculate();
    }

    @Override
    protected void salaryRecalculate()
    {
        salary = (long) (salary * 1.05);
    }

    @Override
    public void getWorkersPortfolio()
    {
        System.out.println();
        System.out.println(manager);
        super.getWorkersPortfolio();
    }
}