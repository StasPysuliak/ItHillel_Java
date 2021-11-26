package home.work17.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;

class Reader {
    TreeMap<String, Integer> product = new TreeMap<>();
    TreeMap<String, TreeMap> customer = new TreeMap<>();

    public TreeMap<String, TreeMap> getCustomer() {
        return customer;
    }

    void reader() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("G:\\Java\\JavaHomeWork\\src\\home\\work17\\task2\\customers.txt"));
        try {
            String[] tmp;
            String line = br.readLine();

            while (line != null) {
                tmp = line.split(" ");
                parser(tmp);
                line = br.readLine();
            }

        } finally {
            br.close();
        }
    }

    private void parser(String[] tmp) {
        product.put(tmp[1],Integer.parseInt(tmp[2]));
        customer.put(tmp[0],product);
    }
}
