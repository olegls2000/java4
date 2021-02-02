package model;

import utils.MyUtils;

public class TeamLead extends AbstractManager {
    private String teamName;

    public TeamLead(String name, String lastName, Integer age, Long salary, String teamName) {
        super(name, lastName, age, salary);
        this.teamName = teamName;
    }

    public TeamLead() {
        super(
                MyUtils.getRandomItem(new String[]{"Ivan", "Nina"}),
                MyUtils.getRandomItem(new String[]{"LN1", "LN2"}),
                MyUtils.getRandomFromRange(18, 65),
                (long) MyUtils.getRandomFromRange(100_000, 300_000)
        );
        this.teamName = MyUtils.getRandomItem(new String[]{"Team1", "Team2"});
    }

    @Override
    public void salaryRecalculate() {
        super.salaryRecalculate();
        salary += 750;
    }
}
