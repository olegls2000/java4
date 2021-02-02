package model;

public abstract class AbstractManager extends AbstractWorker {

    public AbstractManager(String name, String lastName, Integer age, Long salary) {
        super(name, lastName, age, salary);
    }

    @Override
    public void salaryRecalculate() {
        salary = (long) (salary * 1.05);
    }

}
