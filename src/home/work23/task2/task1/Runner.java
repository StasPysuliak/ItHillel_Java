package home.work23.task2.task1;

public class Runner {
    public void run() {
        Integer[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] doubleArr = {1.0, 2.1, 3.2, 4.3, 5.4, 6.5, 7.6, 8.7, 9.8};

        System.out.println(MyTestMethod.calcNum(intArr, 3));
        System.out.println(MyTestMethod.calcNum(doubleArr, 4.3));
        System.out.println(MyTestMethod.calcSum(intArr, 3));
        System.out.println(MyTestMethod.calcSum(doubleArr, 4.3));
    }
}
