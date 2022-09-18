
import java.util.Scanner;


public class UserInterface {
    private BirdWatcher watcher;
    private Scanner scan;
    
    public UserInterface(Scanner scan, BirdWatcher watcher) {
        this.scan = scan;
        this.watcher = watcher;
    }
    
    public void start() {
        while(true) {
            System.out.print("? ");
            String command = scan.nextLine();
            if(command.equals("Quit")) {
                break;
            } else if(command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scan.nextLine();
                watcher.addBird(new Bird(name, nameLatin));
            } else if(command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                watcher.observation(name);
            } else if(command.equals("All")) {
                watcher.All();
            } else if(command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                watcher.One(name);
            }
        }
    }
    
}
