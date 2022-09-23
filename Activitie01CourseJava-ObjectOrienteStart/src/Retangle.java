
public class Retangle {
	public double whidth;
	public double height;
	
	public double Area() {
		return whidth * height;
	}
	
	public double Perimeter() {
		return 2 * (whidth + height);
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(height, 2) + Math.pow(whidth, 2)); 
	}
}
