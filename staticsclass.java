// statics
// statics nu pottu onnu define panni vechuta athu fixed ha irukkum
// oru school la oru principal tha irupanga so atha  fixed ha  vekkalam
class student {
    int rollNo = 12345;
    static String principal = "raju";
}

public class staticsclass {
    public static void main(String[] args) {
        student obj = new student();
        System.out.println(student.principal);
        System.out.println(obj.rollNo);
    }
}
