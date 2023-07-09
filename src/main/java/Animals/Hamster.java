package Animals;

public class Hamster extends Animal{
    public Hamster(String name, String command, String type) {
        super(name, command, "Домашнее животное");
    }

    @Override
    public void teachNewCommand(String newCommand) {
        String newSkills = getSkills() + newCommand;
        setSkills(newSkills);
        System.out.println("Теперь хомяк" + getName() + "умеет " + newCommand);
    }
    @Override
    public void commands() {
        System.out.println("Хомяк " + getName() + "знает команды " + getSkills());
    }
}
