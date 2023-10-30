package rw.ac.rca.exc;

import java.io.FileInputStream;

public class Program {
    public static  void  main(String[] args){
        try{
        int a=0;
        int d=20;
        int k= d/a;
        System.out.println("THe value of k " + k);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        try {
            int[] arr = {0, 20, 30, 40};
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        finally {
            System.out.println("After inside finally catch error");
        }




    }
}
