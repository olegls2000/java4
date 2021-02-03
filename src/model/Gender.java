package model;

public enum Gender {
    FEMALE("female"),
    MALE("male");

    public String name;

    Gender(String name)
    {
        this.name = name;
    }
}