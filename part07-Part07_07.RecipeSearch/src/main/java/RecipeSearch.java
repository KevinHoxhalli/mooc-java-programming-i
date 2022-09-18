
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        RecipeManager manager = new RecipeManager();
        UserInterface user = new UserInterface(scanner, manager, file);
        user.start();
    }

}
