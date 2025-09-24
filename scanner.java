import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        number = input.nextInt();
        System.out.println("Entered Number is :" + number);
    }

}
