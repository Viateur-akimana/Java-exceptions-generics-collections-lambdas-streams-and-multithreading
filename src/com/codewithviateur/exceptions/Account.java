package com.codewithviateur.exceptions;

public class Account {
  public static void deposit(float amount){
    if(amount <= 0)
      throw new IllegalArgumentException();
  }
}
















