package home.work29.classes;

import home.work29.annotation.Start;

@Start(priority = 10, method = "run")
public class Foo3 {
    public void run() {
        System.out.println("Foo3");
    }
}
