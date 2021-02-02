package model;

public class Director extends AbstractManager {

    private String department;

    public Director(String name, String lastName, Integer age, Long salary, String department) {
        super(name, lastName, age, salary);
        this.department = department;
    }

    @Override
    public void salaryRecalculate() {
        super.salaryRecalculate();
        salary += 1500;
    }
}
