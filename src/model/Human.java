package model;

public class Human {
    private String firstName;
    private String lastName;
    private String gender;
    private Integer age;

    public Human(String firstName, String lastName,
                 String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Human() {
    }

    public void marriage(Human anotherHuman) {
        if (anotherHuman.gender.equals("male")) {
            this.lastName = anotherHuman.lastName;
        }

        if (anotherHuman.gender.equals("female")) {
            anotherHuman.lastName = this.lastName;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void secretMethod(){
        System.out.println("Hello From Secret!!!");
    }
}
