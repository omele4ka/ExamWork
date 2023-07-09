import Database.DB;
import ProgramMenu.Menu;
public class Main {
    public static void main(String[] args) {
        DB db = new DB();
        Menu menu = new Menu(db);
        menu.mainMenu();
    }
}
