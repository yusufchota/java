interface in {
    void m1();
};

interface inn {
    void m2();
};

class in1 implements in, inn {
    public void m1() {
        System.out.println("hii");
    }

    public void m2() {
        System.out.println("hello");
    }
}

public class interfacemethod {
    public static void main(String[] args) {
        in1 obj = new in1();
        obj.m1();
        obj.m2();
    }
}
