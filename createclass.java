class frist {
    public void name() {
        System.out.println("this is from first class");
    }

    public void methodOne(int a, int b) {
        System.out.println(a + b);
    }
}

class Two {
    public void name() {
        System.out.println("this  is from class two");
    }

    public void methodOne(int a, int b) {
        System.out.println(a + b);
    }
}

public class createclass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        frist obj = new frist();
        obj.name();
        obj.methodOne(100, 34);
        Two obj2 = new Two();
        obj2.name();
        obj2.methodOne(100, 1000);
    }
}
