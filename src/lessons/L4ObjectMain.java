package lessons;

import model.Student;

public class L4ObjectMain {
    public static void main(String[] args) {
        Student jon = new Student("Jon", "Do", 21, 9.0); // 196
        //jon = null;
        Student nina = new Student("Nina", "Ivanova", 20, 10.98); // 196
        Student mike = new Student("Mike", "Mihkelson");
        Student mike2 = new Student("Mike", "Mihkelson");

        Student[] students = {jon, nina, mike, mike2};
        Student youngest = students[0];
        for (int i = 1; i < students.length; i++) {
            if(students[i].age< youngest.age) {
                youngest = students[i];
            }
        }
        System.out.println("Youngest Student: " + youngest.name);
    }

}
