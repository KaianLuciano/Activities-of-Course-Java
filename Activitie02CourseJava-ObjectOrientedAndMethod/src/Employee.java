
public class Employee {

		public String Name;
		public double GrossSalary;
		public double Tax;
		
		public double netSalary() {
			return GrossSalary - Tax;
		}
		
		public double IncreaseSalary(double porcentagem) { 
			return this.GrossSalary +=  GrossSalary * porcentagem / 100;
		}
		
		public String toString() {
		return Name + ", " + " $ " + String.format("%.2f", netSalary());
		}
}
