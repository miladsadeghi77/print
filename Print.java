package ir.maktab.practice12;

import java.util.Scanner;

public class Print {
        static boolean flag = true;
        public static void main(String[] args) {
            System.out.println("Enter your Input: ");
            System.out.println("Enter 'exit' to exit");
            while (flag) {
                printOutput();
            }
        }
        private static void printOutput() {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            if (str.equals("exit"))
                flag = false;
            else {
                int number = scanner.nextInt();
                System.out.printf("%-15s%03d", str, number);

            }
        }
}