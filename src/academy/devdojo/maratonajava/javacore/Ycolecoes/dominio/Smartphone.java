package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {

	private String serialNumber;
	private String marca;

	public Smartphone(String serialNumber, String marca) {
		super();
		this.serialNumber = serialNumber;
		this.marca = marca;
	}

	// Reflexivo: x.equals(x) tem de ser true para tudo que for diferente de null;
	// Simétrico: para x e y diferentes de null, se x.equals(y) == true logo,
	// y.equals(x) == true;
	// Transitividade: para x, y e z diferentes de null, se x.equals(y) == true, e
	// x.equals(z) == true logo, y.equals(z) == true;
	// Consistente: x.equals(x) sempre retorna true se x for diferente de null
	// para x diferente de null, x.equals(null) tem que retornar false.
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
		Smartphone smartphone = (Smartphone) obj;
		return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
	}

	// se x.equals(y) == true, y.hashcode() == x.hashcode();
	// y.hashcode() == x.hashcode() não necessariamente o equals de y.equals(x) tem
	// de ser true;
	// y.hashcode() != x.hashcode() x.equals(y) deverá ser false.
	@Override
	public int hashCode() {
		return serialNumber == null ? 0 : this.serialNumber.hashCode();
	}

	@Override
	public String toString() {
		return "Smartphone [serialNumber=" + serialNumber + ", marca=" + marca + "]";
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
