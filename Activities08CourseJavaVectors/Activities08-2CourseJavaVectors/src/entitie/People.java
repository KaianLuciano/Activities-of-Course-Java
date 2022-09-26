package entitie;

public class People {
	private String name;
	private int year;
	private double height;
	
	public People(String name, int year, double height) {
		super();
		this.name = name;
		this.year = year;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public static double porcentagemValor(double quantidadePessoas, double pessoasMenos16) {
		return pessoasMenos16 / quantidadePessoas * 100;
	}
	
}
