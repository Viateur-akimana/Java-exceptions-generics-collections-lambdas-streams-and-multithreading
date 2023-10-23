package com.codewithviateur;

import com.codewithviateur.exceptions.Account;
import com.codewithviateur.exceptions.ExceptionsDemo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ExceptionsDemo.show();
        try {
            Account.deposit(4);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
