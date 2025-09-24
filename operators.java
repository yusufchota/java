public class operators {
    public static void main(String[] args) {
        // + - * / operators
        int a = 100;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        // == ,!=, <=, >= ,<,>
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a > b);
        // and& or|| not!
        // and &&
        if (a <= b && a >= b) {
            System.out.println("condition true");
        } else {
            System.out.println("condition false");
        }
        // or ||
        if (a <= b || a >= b) {
            System.out.println("condition true");
        } else {
            System.out.println("condition false");
        }
        // Not !
        if (a != b) {
            System.out.println("condition true");
        } else {
            System.out.println("condition false");
        }
    }
}
