package Revision;

public class Check {

    static void hello() {
        System.out.println("Hello, world!");
    }

    public void helloWorld() {
        System.out.println("Hello, world!!");
    }

    public static void main(String[] args) {
        Check obj = new Check();
        hello();
        obj.helloWorld();
    }
}
