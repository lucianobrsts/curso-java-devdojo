package academy.devdojo.maratonajava.javacore.ZZAclassesinternar.test;

class Animal {
	public void Walk() {
		System.out.println("Animal walking");
	}
}

public class AnonymousClassesTest01 {

	public static void main(String[] args) {
		Animal animal = new Animal() {
			@Override
			public void Walk() {
				System.out.println("Walking in the shadows...");
			}
		};
		animal.Walk();
	}

}
