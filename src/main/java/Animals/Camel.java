package Animals;

public class Camel extends Animal{
    public Camel(String name, String command, String type) {
        super(name, command, "Вьючное животное");
    }

    @Override
    public void teachNewCommand(String newCommand) {
        String newSkills = getSkills() + newCommand;
        setSkills(newSkills);
        System.out.println("Теперь верблюд" + getName() + "умеет " + newCommand);
    }
    @Override
    public void commands() {
        System.out.println("верблюд " + getName() + "знает команды " + getSkills());
    }
}
