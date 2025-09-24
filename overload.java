// method overloading
// method  overloading na main method illama innoru method create panni atha main 
// method la call panna athu tha method over loading  
public class overload {
    // main method
    public static void main(String[] args) {
        System.out.println("Hello world");
        methodOne(10, 20);
        methodTwo(100, 20);
    }

    // method one
    public static void methodOne(int a, int b) {
        System.out.println(a + b);
    }

    // method two
    public static void methodTwo(int a, int b) {
        System.out.println(a - b);
    }

}