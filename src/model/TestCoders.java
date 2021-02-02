package model;

import static utils.MyUtils.getRandomItem;

public class TestCoders extends Rabotjagi{
    protected String project;
    public TestCoders(String name,String lastName,Integer age,Long salary){
        super(name,lastName,age,salary);
        this.project = getRandomItem(new String[]{"UBS", "Pentagon", "NASA"});
    }

}

