package Animals;

public abstract class Animal {
    protected String name;
    protected String command;
    protected String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public void executeCommand(String command){
        System.out.println("Это  " + type + name + "умеет " + command);
    }
}
