package comparator;

import model.Director;

import java.util.Comparator;

public class DirectorSalaryComparator
        implements Comparator<Director> {
    @Override
    public int compare(Director o1, Director o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}
