package home.work17.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.TreeMap;

class Reader {
    private TreeMap<String, Integer> product = new TreeMap<>();
    private TreeMap<String, TreeMap> customer = new TreeMap<>();

    TreeMap<String, TreeMap> getCustomer() {
        return customer;
    }

    void reader() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("G:\\Java\\JavaHomeWork\\src\\home\\work17\\task2\\customers.txt"));
            String line = br.readLine();
            while (line != null) {
                parser(line.split(" "));
                line = br.readLine();
            }
    }

    private void parser(String[] tmp) {
        System.out.println(Arrays.toString(tmp));
        product.put(tmp[1],Integer.parseInt(tmp[2]));
        customer.put(tmp[0],product);
    }
}
