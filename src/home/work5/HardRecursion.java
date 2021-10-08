//package home.work5;
//
//import javax.swing.*;
//
//public class HardRecursion {
//
//    private static boolean status = true;
//
//    public static void main(String[] args) {
//        int number = 13;
//        int ourNumber = 1;
//        System.out.println(result(number));
//    }
//
//    private static String result(int number){
//
//    }
//
//    private static String rec3(int number, int ourNumber) {
//        if (ourNumber == number) return 1 + rec3(number, ourNumber);
//
//        if (ourNumber < number) rec5(number,ourNumber);
//
//    }
//
//    private static String rec5(int number, int ourNumber) {
//        if (number == ourNumber) return rec5(number,ourNumber);
//        if (ourNumber < number) {
//            ourNumber += 5;
//            return "+5" + rec5(number,ourNumber);
//        }
//        return "";
//    }
//}
