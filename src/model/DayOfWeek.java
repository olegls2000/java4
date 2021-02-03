package model;

public enum DayOfWeek {
    SUNDAY("Sunday", 0, false),
    MONDAY("Monday", 1, true),
    TUESDAY("Tuesday", 2, true),
    WEDNESDAY("Wednesday", 3, true),
    THURSDAY("Thursday", 4, true),
    FRIDAY("Friday", 5, true),
    SATURDAY("Saturday", 6, false);

    public String name;
    public int order;
    public boolean isWorking;

    DayOfWeek(String name, int order, boolean isWorking)
    {
        this.name = name;
        this.order = order;
        this.isWorking = isWorking;
    }
}
