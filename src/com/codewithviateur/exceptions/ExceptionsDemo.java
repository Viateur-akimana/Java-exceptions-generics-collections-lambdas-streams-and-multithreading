package com.codewithviateur.exceptions;


import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
  public static void show(){
    FileReader reader = null;
    try {
      reader = new FileReader("file.txt");
      var value = reader.read();
    }
    catch (IOException e){
      System.out.println("The file doesn't exist");
    }
    finally {
      try {
        if (reader != null)
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
