package io;
import java.io.*;
import java.util.Scanner;
public class Scanning {

        public static void main(String[] args) throws IOException {
            Scanner s = null;
            try {
               s = new Scanner(new BufferedReader(new FileReader("/home/akimana/IdeaProjects/Advanced concepts/src/io/rca.txt")));

                while (s.hasNext()) {
                    s.useDelimiter(",");
                    System.out.println(s.next());
                }
            } catch (IOException e) {
                System.out.println("Exception" + e.getMessage());
            } finally {
                if (s != null) {
                    s.close();
                }
            }
        }
    }

