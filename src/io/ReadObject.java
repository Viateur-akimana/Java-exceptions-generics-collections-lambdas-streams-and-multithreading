package io;

import  java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadObject {

        public static  void main(String[] args) throws IOException {
            FileInputStream in = null;
            FileOutputStream out = null;

            try {
                in = new FileInputStream("Student.java");
                out = new FileOutputStream("newStudent.java");
                int c;
                while ((c = in.read()) != -1) {
                    out.write(c);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
                if (out != null) {
                    System.out.println("Writing successfully done");
                }
//                System.out.println("writing completed");
            }
        }
}
