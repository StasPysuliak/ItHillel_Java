package home.work29.classes;

import home.work29.annotation.Start;

@Start(priority = 100, method = "initialize")
public class Foo6 {
    public void initialize() {
        System.out.println("Foo6");
    }
}
