package home.work17.task2;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws Exception {
        TreeMap<String, TreeMap> customers;
        Reader reader = new Reader();
        reader.reader();
        customers = reader.getCustomer();
        for (String treeKey : customers.keySet()) {
            System.out.println(treeKey + ": " + customers.get(treeKey));
        }
    }
}
