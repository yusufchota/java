class a {
    void m1() {
        System.out.println("this is  a class");
    }

    class b {
        void m2() {
            System.out.println("this is b class");
        }
    }
}

public class innerclass {
    public static void main(String[] args) {
        a obj = new a();
        obj.m1();
        a.b obj1 = obj.new b();
        obj1.m2();
    }
}
