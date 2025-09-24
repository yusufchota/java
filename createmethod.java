// create method
// create method na main method illama innoru method create panni atha main 
// method la call panna athu tha create method 
public class createmethod {
    public static void main(String[] args) {
        System.out.println("Hello world");
        methodOne(10, 20);
        methodTwo(100, 20);
    }

    public static void methodOne(int a, int b) {
        System.out.println(a + b);
    }

    public static void methodTwo(int a, int b) {
        System.out.println(a - b);
    }
}
