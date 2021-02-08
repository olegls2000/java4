package homework;

public class ReflHomeWork {
    int age;
    String tt;

    public ReflHomeWork(Integer age, String tt) {
        this.age = age;
        this.tt = tt;
    }

    @Override
    public String toString() {
        return "ReflHomeWork{" +
                "age=" + age +
                ", tt='" + tt + '\'' +
                '}';
    }
}
