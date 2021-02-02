package model;

public class Qa extends AbstractExecutor {
    private String project;

    public Qa(String name, String lastName, Integer age, Long salary, String project) {
        super(name, lastName, age, salary);
        this.project = project;
    }

    @Override
    public void salaryRecalculate() {
    }
}
