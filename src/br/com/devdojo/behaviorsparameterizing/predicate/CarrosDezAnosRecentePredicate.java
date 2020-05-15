package br.com.devdojo.behaviorsparameterizing.predicate;

import br.com.devdojo.behaviorsparameterizing.classes.Carro;
import br.com.devdojo.behaviorsparameterizing.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR)-10);
    }
}
