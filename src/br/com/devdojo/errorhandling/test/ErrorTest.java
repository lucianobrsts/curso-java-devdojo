package br.com.devdojo.errorhandling.test;

public class ErrorTest {

    public static void main(String[] args) {

        stackOverflowError();
    }

    public static void stackOverflowError() {
        stackOverflowError();
    }
}
