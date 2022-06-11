package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
	public static void main(String[] args) {
		Locale localDefaout = Locale.getDefault();
		Locale localBR = new Locale("pt", "BR");
		Locale localJP = Locale.JAPAN;
		Locale localIT = Locale.ITALY;

		NumberFormat[] nfa = new NumberFormat[4];
		nfa[0] = NumberFormat.getCurrencyInstance();
		nfa[1] = NumberFormat.getCurrencyInstance(localJP);
		nfa[2] = NumberFormat.getCurrencyInstance(localBR);
		nfa[3] = NumberFormat.getCurrencyInstance(localIT);

		double valor = 1000.2130;

		for (NumberFormat numberFormat : nfa) {
			System.out.println(numberFormat.format(valor));
		}
		
		String valorString = "R$ 1.000,21";
		try {
			System.out.println(nfa[0].parse(valorString));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
