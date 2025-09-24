class car {
    int speed;

    car(int s) {
        this.speed = s;
    }
}

public class thisclass {
    public static void main(String[] args) {
        car obj = new car(100);
        System.out.println(obj.speed);
    }
}
