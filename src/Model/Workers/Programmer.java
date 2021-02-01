package Model.Workers;

import static Utils.MyUtils.getRandomString;

public class Programmer extends Performer {
    private String[] programmingLanguage = {"Java", "C#", "Python"};
    private String progLang;

    public Programmer()
    {
        this.progLang = getRandomString(programmingLanguage);
    }

    @Override
    public void salaryRecalculate()
    {
        salary += 300;
    }

    @Override
    public void getWorkersPortfolio()
    {
        super.getWorkersPortfolio();
        System.out.println("Programming language: " + progLang);
    }
}