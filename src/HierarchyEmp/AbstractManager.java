package HierarchyEmp;

import HierarchyEmp.AbstractWorker;

public abstract class AbstractManager extends AbstractWorker {

    public AbstractManager(String name, String lastName, Integer age, Long salary) {
        super(name, lastName, age, salary);
    }

    @Override
    public void salaryCalculate() {
        salary = (long) (salary * 0.05);
    }


}