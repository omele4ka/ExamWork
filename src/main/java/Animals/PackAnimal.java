package Animals;

public class PackAnimal extends Animal{

    public PackAnimal(String name, String command) {
        super(name, command);
    }

    @Override
    public String getType() {
        return "Вьючное животное ";
    }
}
