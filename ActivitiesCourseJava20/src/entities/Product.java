package entities;

public class Product implements Comparable<Product>{

	private String name;
	private Double salary;
		
	public Product() {
	}
	
	public Product(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

	@Override
	public String toString() {
		return name + ", " + salary;
	}

	@Override
	public int compareTo(Product other) {
		return salary.compareTo(other.getSalary());
	}

}
