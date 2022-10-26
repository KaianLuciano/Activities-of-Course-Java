package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private double baseSalary;

	private Departament departament;
	private List<HourContract> contract = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContract() {
		return contract;
	}

	public void addContract(HourContract contract) {
		this.contract.add(contract);
	}

	public void removeContract(HourContract contract) {
		this.contract.remove(contract);
	}

	public Double income(int year, int month) {
		double sum = baseSalary;
		Calendar calendar = Calendar.getInstance();
		for (HourContract c : contract) {
			calendar.setTime(c.getDate());
			int calendarYear = calendar.get(Calendar.YEAR);
			int calendarMonth = 1 + calendar.get(Calendar.MONTH);
			if (year == calendarYear && month == calendarMonth) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}