class car {
    int speed;
    String color;

    car() {
        speed = 100;
        color = "white";
    }

    car(int s) {
        this.speed = s;
    }

    car(String c) {
        this.color = c;
    }

    car(int s, String c) {
        this.speed = s;
        this.color = c;
    }

    car(String c, int s) {
        this.speed = s;
        this.color = c;
    }
}

public class constructor {
    public static void main(String[] args) {
        car bmw = new car();
        System.out.println(bmw.speed);
        System.out.println(bmw.color);
    }
}
