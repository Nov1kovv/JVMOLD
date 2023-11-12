package staticExample;

public class Main {
    public static void main(String[] args) {
     A a = A.newInstance();
     A a2 = A.newInstance();

        System.out.println(a);
        System.out.println(a2);

        System.out.println("---");

        A a3 = new A();
        A a4 = new A();

        System.out.println(a3);
        System.out.println(a4);
    }


}

class A{

    static A instance = new A();

     A() {}

    static int a = 10;
    int b = 20;

    static A newInstance(){
        return instance;
    }

}