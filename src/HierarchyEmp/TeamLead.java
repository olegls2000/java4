package HierarchyEmp;


    public class TeamLead extends AbstractManager {
    private String teamName;

    public TeamLead(String name, String lastName, Integer age, Long salary, String teamName) {
        super(name, lastName, age, salary);
        this.teamName = teamName;
    }

    public TeamLead() {
        super(
                Lessons.MyUtils.getRandomItem(new String[]{"Ivan", "Nina"}),
                Lessons.MyUtils.getRandomItem(new String[]{"LN1", "LN2"}),
               Lessons.MyUtils .getRandomFromRange(18, 65),
                (long)Lessons.MyUtils .getRandomFromRange(100_000, 300_000)
                );
        this.teamName = Lessons.MyUtils.getRandomItem(new String[]{"Team1", "Team2"});
    }

    @Override
    public void salaryCalculate() {
        super.salaryCalculate();
        salary += 750;
    }
}