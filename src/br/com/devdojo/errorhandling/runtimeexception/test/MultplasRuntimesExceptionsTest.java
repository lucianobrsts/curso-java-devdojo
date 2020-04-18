package br.com.devdojo.errorhandling.runtimeexception.test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultplasRuntimesExceptionsTest {

    public static void main(String[] args) {

        try {
            throw new IndexOutOfBoundsException();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Dentro do Multi-Catch");
        }
            System.out.println("Fim do programa");

        try {
            talvezLanceException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, AWTException, FileNotFoundException {

    }
}
