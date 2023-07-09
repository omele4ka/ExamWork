package Animals;

public class Horse extends Animal{
    public Horse(String name, String skills, String type) {
        super(name, skills, "Вьючное животное");
    }

    @Override
    public void teachNewCommand(String newCommand) {
        String newSkills = getSkills() + newCommand;
        setSkills(newSkills);
        System.out.println("Теперь лошадь" + getName() + "умеет " + newCommand);
    }
    @Override
    public void commands() {
        System.out.println("лошадь " + getName() + "знает команды " + getSkills());
    }
}
