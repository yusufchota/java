abstract class car {
    void run() {
    };

    abstract void running();
}

class bmw extends car {
    void running() {
        System.out.println("car is running");
    }
}

public class abstractclass {
    public static void main(String[] args) {
        car obj = new bmw();
        obj.running();
    }
}
