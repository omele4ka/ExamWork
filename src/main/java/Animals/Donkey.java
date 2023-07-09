package Animals;

public class Donkey extends Animal{
    public Donkey(String name, String skills, String type) {
        super(name, skills, "Вьючное животное");
    }

    @Override
    public void teachNewCommand(String newCommand) {
        String newSkills = getSkills() + newCommand;
        setSkills(newSkills);
        System.out.println("Теперь осел" + " " + getName() + " " + "умеет " + " " + newCommand);
    }
    @Override
    public void commands() {
        System.out.println("Осел " + " " + getName() + " " + "знает команды: " + " " + getSkills());
    }
}
