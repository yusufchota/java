class a {
    void one() {
        System.out.println("this is class a");
    }
}

class b extends a {
    void one() {
        System.out.println("this is class b");
    }
}

public class overriding {
    public static void main(String[] args) {
        b obj = new b();
        obj.one();
    }
}
