
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int max =  number1;
        if (number1 >= number2 && number1 >= number3) {
            max = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            max = number2;
        } else if (number3 >= number1 && number3 >= number2) {
            max = number3;
        }
        return max;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
