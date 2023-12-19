package projects;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//entering the number of rows
		System.out.println("Enter the number of rows:");
		int numRows = scanner.nextInt();
		
		int count = 1;
		
		for (int i=1; i<=numRows; i++)
		{
			//for printing the spaces
			for(int j=1; j<=numRows -i; j++)
			{
				System.out.print("\t");
			}
			
			//for printing the numbers
			for(int j=1;j<=i; j++)
			{
				System.out.print(count + "\t\t");
				//incrementing 
				count++;
			}
			
			System.out.println(" ");
		}
		
		scanner.close();

	}

}
