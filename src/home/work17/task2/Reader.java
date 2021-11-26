package home.work17.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeMap;

class Reader {
    private ArrayList<String> customers = new ArrayList();
    private ArrayList<Order> orders = new ArrayList();
    private TreeMap<String, TreeMap> customerMap;
    private TreeMap<String, Integer> orderMap;


    private void myReader() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("G:\\Java\\JavaHomeWork\\src\\home\\work17\\task2\\customers.txt"));
        String line = br.readLine();
        while (line != null) {
            parser(line.split(" "));
            line = br.readLine();
        }
    }

    private void parser(String[] tmp) {
        if (!customers.contains(tmp[0])) customers.add(tmp[0]);
        orders.add(new Order(tmp[0], tmp[1], Integer.parseInt(tmp[2])));
    }

    TreeMap customerGenerator() {
        try {
            myReader();
        } catch (Exception e) {
            e.printStackTrace();
        }
        customerMap = new TreeMap<>();
        for (String s : customers) {
            orderMap = new TreeMap<>();
            for (Order o : orders) {
                if (Objects.equals(o.getName(), s)) {
                    if (!orderMap.containsKey(o.getProduct())) orderMap.put(o.getProduct(), o.getCount());
                    else orderMap.put(o.getProduct(), orderMap.get(o.getProduct()) + o.getCount());
                }
            }
            customerMap.put(s,orderMap);
        }
        return customerMap;
    }
}
