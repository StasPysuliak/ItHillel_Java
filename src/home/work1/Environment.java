package home.work1;

public class Environment {
    public static void main(String[] args) {

        String out = "";

        try {
            out = System.getenv(args[0]);
        } catch (Exception ex) {
            out = "Wrong argument.Enter the values of the environment variables";
        } finally {
            System.out.println("\n" + out);
        }

    }
}
