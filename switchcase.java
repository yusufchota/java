import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        String student;
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name : ");
        student = input.next();
        switch (student) {
            case "yusuf":
                System.out.println("Hi " + student);
                break;
            case "musa":
                System.out.println("Hi " + student);
                break;
            case "sulai":
                System.out.println("Hi " + student);
                break;
            default:
                System.out.println("your name in not a list");
                break;
        }
    }
}
