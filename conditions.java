import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        int pen = 10;
        int specialpen = 50;
        int cost;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Cost :");
        cost = input.nextInt();
        if (cost >= specialpen) {
            System.out.println("you can buy a specialpen");
        } else if (cost >= pen) {
            System.out.println("you can buy a pen");
        } else {
            System.out.println("you can't buy a pen , you have less money");
        }
    }
}
