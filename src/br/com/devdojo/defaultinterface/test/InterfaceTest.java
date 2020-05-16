package br.com.devdojo.defaultinterface.test;

import br.com.devdojo.defaultinterface.interfaces.MyList;

public class InterfaceTest implements MyList {
    public static void main(String[] args) {
        MyList.sort();

        new InterfaceTest().remove();
    }

    @Override
    public void add() {
        System.out.println("Dentro do Add");
    }
}
