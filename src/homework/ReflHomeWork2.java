package homework;

public class ReflHomeWork2 {
    double age;
    double tt;
    String xx;

    public ReflHomeWork2(double age, double tt, String xx) {
        this.age = age;
        this.tt = tt;
        this.xx = xx;
    }

    @Override
    public String toString() {
        return "ReflHomeWork2{" +
                "age=" + age +
                ", tt=" + tt +
                ", xx='" + xx + '\'' +
                '}';
    }
}
