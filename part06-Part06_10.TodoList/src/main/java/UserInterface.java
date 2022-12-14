
import java.util.Scanner;

public class UserInterface {
    
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();
            if(word.equals("stop")) {
                break;
            } else if(word.equals("add")) {
                this.add();
            } else if(word.equals("list")) {
                this.list();
            } else if(word.equals("remove")) {
                this.remove();
            }
        }
    }
    public void add() {
        System.out.print("To add: ");
        String word = scanner.nextLine();
        this.list.add(word);
    }
    
    public void list() {
        
        this.list.print();
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int removed = Integer.valueOf(scanner.nextLine());
        this.list.remove(removed);
    }
}
