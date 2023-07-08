package Animals;

public abstract class Animal {
    protected String name;
    protected String command;
    protected String type;

    public abstract String getType();

    public Animal(String name, String command) {
        this.name = name;
        this.command = command;
    }

    public String getName(){
        return name;
    }

    public String getCommand(){
        return command;
    }

    public void executeCommand(String command){
        System.out.println("Это  " + getType() + name + "умеет " + command);
    }
}
