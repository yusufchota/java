// getter & setter
class a {
    private int id;
    private String password;

    public int getid(int id) {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getpasword(String password) {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

}

public class encapsulation {
    public static void main(String[] args) {
        a obj = new a();
        System.out.println(obj.getid(12345));
        System.out.println(obj.getpasword("yusuf"));
    }
}
