package br.com.devdojo.errorhandling.runtimeexception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultplasRuntimesExceptionsTest {

    public static void main(String[] args) {

        try {
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }
        System.out.println("Fim do programa");

        try {
            talvezLanceException();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
