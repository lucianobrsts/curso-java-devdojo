package br.com.devdojo.utilityclasses.token;

public class TokenTest {

    public static void main(String[] args) {
        // pode se usar qualquer delimitador como: . , " " ou até mesmo expressões regulares
        String atr = "Willian1 Paulo5 Luana9 Camila2 Ana6 John8 Matheus";
        String[] tokens = atr.split("\\d");

        for (String arr : tokens) {
            System.out.println(arr.trim());
        }
    }
}
