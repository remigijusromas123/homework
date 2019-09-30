package Statusis;

	import java.util.Scanner;

	public class StatTrikam {
		private static Scanner input = new Scanner(System.in);
	    public static void main(String args[]) {

	        int side1; int side2; int side3;
	   
	        String Q1 = "Pirmoji krastine?";
	        String Q2 = "Antroji krastine?";
	        String Q3 = "Izambine";

	        System.out.println(Q1);
	        side1 = input.nextInt();
	        
	        while(side1<=0) {
	        	System.out.println("Ivedimo klaida-pasitaisykite");
	        	side1 = input.nextInt();
	        }
	        

	        Scanner input2 = new Scanner(System.in);
	        System.out.println(Q2);
	        side2 = input2.nextInt();
	        
	        while(side2<=0) {
	        	System.out.println("Ivedimo klaida-pasitaisykite");
	        	side2 = input.nextInt();
	        }

	        Scanner input3 = new Scanner(System.in);
	        System.out.println(Q3);
	        side3 = input3.nextInt();
	        
	        while(side3<=0) {
	        	System.out.println("Ivedimo klaida-pasitaisykite");
	        	side3 = input.nextInt();
	        }

	            if((side1*side1) + (side2*side2) == (side3*side3)) {
	                System.out.println("Trikampis yra statusis!");
	            } else {            
	                System.out.println("Trikampis nera statusis");

	            }
	        }
	    }
