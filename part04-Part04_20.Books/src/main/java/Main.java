import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> book = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()) {
                break;
            } 
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            book.add(new Book(title,pages,year));
        }
        System.out.println();
        System.out.print("What information will be printed? ");
        String ans = scanner.nextLine();
        if(ans.equals("everything")) {
            for(Book b: book){
                System.out.println(b.getEverything());
            }
        } else if(ans.equals("name")) {
            for(Book b: book){
                System.out.println(b.getTitle());
            }
        }
    }
}
