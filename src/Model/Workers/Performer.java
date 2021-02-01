package Model.Workers;

public abstract class Performer extends AbstractWorker {
    private String performer = "Performer";

    public Performer()
    {
        this.performer = performer;
        salaryRecalculate();
    }

    public abstract void salaryRecalculate();

    @Override
    public void getWorkersPortfolio()
    {
        System.out.println();
        System.out.println(performer);
        super.getWorkersPortfolio();
    }
}