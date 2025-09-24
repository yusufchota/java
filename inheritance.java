class a {
    a() {
        System.out.println("this is class a");
    }

    void add() {
    };
}

class b extends a {
    b() {
        System.out.println("this is class b");
    }

    void sub() {
    };
}

class c extends b {
    c() {
        System.out.println("this is class c");
    }

    void mul() {
    };
}

public class inheritance {
    public static void main(String[] args) {
        c obj = new c();
        obj.mul();
    }
}
