package nbh2;
import java.util.Scanner;
public class Percentage2 {






	public static void main(String[]args)
	{
		float ELAT_domain, ELAT_english, ELAT_aptitute, ELAT_computer;
		double total, percentage;
		Scanner sc = new Scanner(System.in);
		
		//input marks of all four subjects
		
		System.out.println("Enter the marks of four subject:- ");
		System.out.print("Enter the marks of ELAT_domain: ");
		ELAT_domain = sc.nextFloat();
		System.out.print("Enter the marks of ELAT_english: ");
		ELAT_english = sc.nextFloat();
		System.out.println("Enter the marks of ELAT_aptitute: ");
		ELAT_aptitute = sc.nextFloat();
		System.out.println("Enter the marks of ELAT_computer: ");
		ELAT_computer = sc.nextFloat();
		
		/* calculate the percentage*/
		total = ELAT_domain + ELAT_english + ELAT_aptitute + ELAT_computer;
		percentage = (total / 400.0) * 100;
/*  print the result		 */
	System.out.println("Percentage ="+percentage);	
	}
}