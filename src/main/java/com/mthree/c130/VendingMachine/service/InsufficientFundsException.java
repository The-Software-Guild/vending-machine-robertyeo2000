package com.mthree.c130.VendingMachine.service;

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
