
public class StarSign {

    public static void main(String[] args) {
   
        printStars(2);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(3);
        System.out.println("\n---");
        printRectangle(7, 2);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int i = 0;
        while (i < size) {
            printStars(size);
            i++;
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++){
            printStars(i);
        }
    }
}
