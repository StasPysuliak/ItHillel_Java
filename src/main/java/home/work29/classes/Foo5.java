package home.work29.classes;

import home.work29.annotation.Start;

@Start(priority = 1, method = "run")
public class Foo5 {
    public void run() {
        System.out.println("Foo5");
    }
}
