package home.work29.classes;

import home.work29.annotation.Start;

@Start(priority = 5, method = "initialize")
public class Foo7 {
    public void run() {
        System.out.println("This method should not be called");
    }
}
