import java.util.Scanner;
import java.util.Random;
import java.util.Math;

public class Patterns
{
	public static void main (String[] args)
	{
		System.out.println("Hello!");
		System.out.println("Welcome to the Pattern Generator Game.");
		
		int num = (int)(Math.random()*10+1);
		
		int operator = (int)(Math.random()*4);
		
		int start = 1;
		
		switch(operator) {
		case 0:
			start+=num;
			break;
		case 1:
			start-=num;
			break;
		case 2:
			start*=num;
			break;
		case 3:
			start/=num;
			break;
		}
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println(start + ", ");
		
		System.out.println("insert guess here");
		
		int input = scan.nextInt();
		
		if (input == num) {
			System.out.println("test");
		}
		}
	}
