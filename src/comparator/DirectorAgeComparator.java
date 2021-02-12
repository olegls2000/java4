package comparator;

import model.Director;

import java.util.Comparator;

public class DirectorAgeComparator implements Comparator<Director> {
    @Override
    public int compare(Director o1, Director o2) {
        return o1.getAge() - o2.getAge();
    }
}
