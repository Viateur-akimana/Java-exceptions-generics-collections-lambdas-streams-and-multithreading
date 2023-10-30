package rw.ac.rca.exc;

import java.util.*;

public class HandleError {
        public static void main(String[] args) {
            int a = 0, b = 0, c = 0;
            Random r = new Random();
            for (int i = 0; i < 12000; i++) {
//                try {
                    b = r.nextInt();
                    c = r.nextInt();
                    a = 12345 / (b / c);
//                } catch (ArithmeticException e) {
//                    System.out.println("Division by zero.");
//                    e.printStackTrace();
//                    a = 0; // set a to zero and continue
//                }
                System.out.println("a: " + a);
            }
        }
    }


