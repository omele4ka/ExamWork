package Animals;

public class Dog extends Animal{
    public Dog(String name, String skills, String type) {
        super(name, skills, "Домашнее животное");
    }

    @Override
    public void teachNewCommand(String newCommand) {
        String newSkills = getSkills() + newCommand;
        setSkills(newSkills);
        System.out.println("Теперь собака" + " " + getName() + " " + "умеет " + " " + newCommand);
    }
    @Override
    public void commands() {
        System.out.println("Собака " + " " + getName() + " " + "знает команды " + " " + getSkills());
    }
}
