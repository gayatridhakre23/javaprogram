package javaProgram;
import java.util.Scanner;
public class evenOdd 
{ 
	public static void main(String[] args) 
	{
	System.out.println("Enter the even or odd number");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	if(number%2 ==0)
	{
		System.out.println("Entered Number is Even");
	}
	else
	{
		System.out.println("Entered Number is odd");
	}
    }
}