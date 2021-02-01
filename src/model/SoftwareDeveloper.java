package model;

public class SoftwareDeveloper extends AbstractExecutor {
    private String language;

    public SoftwareDeveloper(String name, String lastName, Integer age, Long salary, String language) {
        super(name, lastName, age, salary);
        this.language = language;
    }

    @Override
    public void salaryRecalculate() {
        salary += 300;
    }
}
