package academy.devdojo.maratonajava.javacore.ZZAclassesinternar.test;

public class OuterClassesTest03 {

	private String name = "Luciano";

	static class Nested {
		private String lastName = "Brito";
		void print() {
			System.out.println(new OuterClassesTest03().name + " " + lastName);
		}
	}

	public static void main(String[] args) {
		Nested nested = new Nested();
		nested.print();

	}

}
