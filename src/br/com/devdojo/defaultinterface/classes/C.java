package br.com.devdojo.defaultinterface.classes;

import br.com.devdojo.defaultinterface.interfaces.A;
import br.com.devdojo.defaultinterface.interfaces.B;

public class C implements A, B {
    public static void main(String[] args) {
        new C().oi();
    }

    public void oi() {
        A.super.oi();
    }
}
