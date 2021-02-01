package HierarchyEmp;


public class Director extends AbstractManager {

    private String department;

    public Director(String name, String lastName, Integer age, Long salary, String department) {
        super(name, lastName, age, salary);
        this.department = department;
    }

    @Override
    public void salaryCalculate() {
        super.salaryCalculate();
        salary += 1500;
    }
}
