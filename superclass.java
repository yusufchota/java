class a {
    a() {
        System.out.println("A");
    }

    a(int a) {
        System.out.println("i,a");
    }
}

class b extends a {
    b() {
        System.out.println("B");
    }

    b(int b) {
        super(1);
        System.out.println("i,b");
    }
}

public class superclass {
    public static void main(String[] args) {
        // b obj = new b(2);
        b apl = new b();
    }
}
