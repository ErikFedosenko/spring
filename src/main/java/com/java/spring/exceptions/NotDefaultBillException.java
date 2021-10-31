package com.java.spring.exceptions;

public class NotDefaultBillException extends RuntimeException {

    public NotDefaultBillException(String message) {
        super(message);
    }
}
