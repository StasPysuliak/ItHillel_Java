package home.work11.staticproperties;

public class TestClass {

    private static Integer staticValue = 99;
    private Integer simpleValue = 99;

    public static void main(String[] arg) {
        System.out.println("Hello, world");
        System.out.println(TestClass.staticValue);

    }
}
