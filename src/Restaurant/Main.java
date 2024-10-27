package Restaurant;
import  java.util.Scanner;

public class Main {
	public static Scanner input= new Scanner(System.in);
	public static int choice,Quantity=1;
	public static String again;
	public static double total=0,Pay;
	public static void menu()
	{
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("\tWELCOME TO OUR RESTAURANT");
		System.out.println("\tRestaurant Menu :");
		System.out.println("\t1.Burger BDT$80.00");
		System.out.println("\t2.Pizza BDT $100.00");
		System.out.println("\t3.Coffee BDT $60.00");
		System.out.println("\t4.Cancel ");
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
	}
public static void order() 
{
	System.out.println("1 to Barger || 2 to pizza || 3 to coffee");
	System.out.println("Press you want to order : ");
	choice=input.nextInt();
	if(choice==1) {
		System.out.println("You choice Barger");
		System.out.println("How many Barger you want :");
		Quantity=input.nextInt();
		total=total+(Quantity*80);
		System.out.println("You want to buy Again :");
		System.out.println("Press Y for [Yess] and N for [No]");
		again=input.next();
		if (again.equalsIgnoreCase("Y"))
		order();
		else
		{
			System.out.println("Enter Payment :");
			Pay=input.nextDouble();
			if(Pay<total)
				System.out.println("No, need more");
			else {
				System.out.println("total="+total);
				total=Pay-total;
				System.out.println("Customer's return "+total);
				
			}
		}
		
	}
	else if(choice==2) {
		System.out.println("You choice Pizza");
		System.out.println("How many Pizza you want :");
		Quantity=input.nextInt();
		total=total+(Quantity*100);
		System.out.println("You want to buy Again :");
		System.out.println("Press Y for [Yess] and N for [No]");
		again=input.next();
		if (again.equalsIgnoreCase("Y"))
		order();
		else
		{
			System.out.println("Enter Payment :");
			Pay=input.nextDouble();
			if(Pay<total)
				System.out.println("No, need more");
			else {
				System.out.println("total="+total);
				total=Pay-total;
				System.out.println("Customer's return "+total);
				
			}
		}
		
	}
	else if(choice==3) {
		System.out.println("You choice Coffee");
		System.out.println("How many Coffee you want :");
		Quantity=input.nextInt();
		total=total+(Quantity*60);
		System.out.println("You want to buy Again :");
		System.out.println("Press Y for [Yess] and N for [No]");
		again=input.next();
		if (again.equalsIgnoreCase("Y"))
		order();
		else
		{
			System.out.println("Enter Payment :");
			Pay=input.nextDouble();
			if(Pay<total)
				System.out.println("No, need more");
			else {
				System.out.println("total="+total);
				total=Pay-total;
				System.out.println("Customer's return "+total);
				
			}
		}
		
	}
	
	else if(choice==4)
	{
		System.exit(0);
	}
	else 
	{
			System.out.println("Choose a Food from this items :");
			order();		
	}
}
	public static void main(String[] args) {
		menu();
		order();
		
	}

}

