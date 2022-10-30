package entities;

public final class OutSourcedEmployee extends Employee{
	
	private Double charge;
	
	public OutSourcedEmployee() {
	}
	
	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double charge) {
		super(name, hours, valuePerHour);
		this.charge = charge;
	}

	public Double getCharge() {
		return charge;
	}

	public void setCharge(Double charge) {
		this.charge = charge;
	}
	
	@Override
	public final Double payment() {
		return hours * valuePerHour + charge;
	}
	
}
