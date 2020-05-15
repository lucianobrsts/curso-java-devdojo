package br.com.devdojo.behaviorsparameterizing.predicate;

import br.com.devdojo.behaviorsparameterizing.classes.Carro;
import br.com.devdojo.behaviorsparameterizing.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
    }
}
