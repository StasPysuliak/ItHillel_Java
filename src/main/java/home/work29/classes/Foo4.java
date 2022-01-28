package home.work29.classes;

import home.work29.annotation.Start;

@Start(priority = 8, method = "run")
public class Foo4 {
    public void run() {
        System.out.println("Foo4");
    }
}
