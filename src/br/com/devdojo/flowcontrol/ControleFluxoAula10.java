package br.com.devdojo.flowcontrol;

public class ControleFluxoAula10 {

    public static void main(String[] args) {
        int idade = 18;
        float salario = 2000;
        boolean c = false;
        String categoria;

        if (c == true) {
            System.out.println("Entrou no clube...");
        }

        System.out.println("------------------------");

        if (idade >= 18) {
            System.out.println("Entrou no clube...");
        } else {
            System.out.println("Não entrou no clube...");
        }

        System.out.println("------------------------");
        // idade < 15 categoria infantil
        //idade >= 15 && idade < 18 Categoria Juvenil
        // >= 18 Categoria Adulto

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
            System.out.println(categoria);
    }
}
