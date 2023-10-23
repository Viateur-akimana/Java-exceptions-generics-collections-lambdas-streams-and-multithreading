package com.codewithviateur.exceptions;

import java.io.IOException;

public class Account {
  public static void deposit(float amount) throws IOException{
    if(amount <= 0)
      throw new IOException();
  }
}
















