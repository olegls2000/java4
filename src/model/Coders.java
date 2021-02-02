package model;

import static utils.MyUtils.getRandomItem;

public class Coders extends Rabotjagi {
    protected String langCode;
    @Override
    public void salaryRecalculate() {
        super.salaryRecalculate();
        salary += 300;
    }
    public Coders(String name,String lastName,Integer age,Long salary){
        super(name,lastName,age,salary);
        this.langCode = getRandomItem(new String[]{"Java", "C#", "Python"});
    }
}
