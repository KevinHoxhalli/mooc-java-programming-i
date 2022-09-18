
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner,SimpleDictionary dict ) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();
            if(word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if(word.equals("add")) {
                this.addWords();
            } else if(word.equals("search")) {
                this.search();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    public void addWords() {
        System.out.println("Word: ");
        String w1 = scanner.nextLine();
        System.out.println("Translation: ");
        String t1 = scanner.nextLine();
        this.dict.add(w1,t1);
    }
    public void search() {
        
        System.out.println("To be translated: ");
        String w1 = scanner.nextLine();
        if(this.dict.translate(w1)==null) {
            System.out.println("Word "+w1+" was not found");
            return;
        }
        System.out.println("Translation: "+this.dict.translate(w1));
    }
}
