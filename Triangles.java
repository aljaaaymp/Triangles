/**
* Java Course 1, Module 2
* 
* Triangles
*
* @author Aljay Pascual
*/
package assignment;
import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the size of the equal sides in an isosceles triangle: ");
		int numberOfTriangle = scan.nextInt();
		
		for (int column = 1 ; column <= numberOfTriangle ; column++)
		{
		for (int row = 1 ; row <= column ; row++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}

}
