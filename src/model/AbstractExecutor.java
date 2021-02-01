package model;

public abstract class AbstractExecutor extends AbstractWorker {
    public AbstractExecutor(String name, String lastName, Integer age, Long salary) {
        super(name, lastName, age, salary);
    }
}
