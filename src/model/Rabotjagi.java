package model;

public abstract class Rabotjagi extends AbstractWorker{
    public void salaryRecalculate(){}
    public Rabotjagi(String name,String lastName,Integer age,Long salary){
        super(name,lastName,age,salary);
    }



}