import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enther number 1: ");
		int n = sc.nextInt();
		System.out.println("Enter number 2: ");
		int n2 = sc.nextInt();
		
		int[][] mat = new int[n][n2];
		
		for(int row = 0; row < mat.length; row++) {
			for(int column = 0; column < mat[row].length; column++) 
			{
				System.out.println("Insert one number: ");
				mat[row][column] = sc.nextInt();
			}
		}
		
		for(int row = 0; row < mat.length; row++) 
		{	
			for(int column = 0; column < mat[row].length; column++) 
			{
					System.out.print(mat[row][column] + " ");	
			}
			System.out.println();
		}
		
		System.out.println("Which number do you want to access: ");
		int numberAcess = sc.nextInt();
		
		for(int row = 0; row < mat.length; row++) 
		{	
			for(int column = 0; column < mat[row].length; column++) 
			{
				if(mat[row][column] == numberAcess) {
					System.out.println("Position: " + row + ", " + column + ":\n");
					column -- ;
					if(column >= 0) {
					System.out.println("Left: " + mat[row][column - 1]);
					}
					column += 2;
					if(column < n2) {
					System.out.println("Right: " + mat[row][column]);
					}
					column --;
					row --;
					if(row >= 0) {
						System.out.println("Up: " + mat[row][column]);
					}
					row += 2;
					if(row < n) {
						System.out.println("Down: " + mat[row][column]);
					}
					row --;
				}
			}

		}
		sc.close();
	}
}