package calculator;

public class calculator {

	public static void main(String[] args) {

		
		aritmetika("*", 50, 5);
		kvadratas(50.2154);
		saknis(32);
		liekana(10,3);
		ntuojuL(3,3);
		procentai(4,5);
		trigonometrija("cot", 60);
		
		

	}
	public static void aritmetika(String operator, double a, double b){
		if (operator == "+") {
			double c = a + b;
			System.out.printf("Sudetis: %.4f \n", c);
		}
		else if (operator == "-") {
			double c = a - b;
			System.out.printf("Atimtis: %.4f \n", c);
		}
		else if (operator == "*") {
			double c = a * b;
			System.out.printf("Daugyba: %.4f \n", c);				
		}
		else if (operator == "/") {
			double c = a * b;
			System.out.printf("Dalyba: %.4f \n", c);	
		}
	}
		
	public static void kvadratas( double a){	
		double c=Math.pow(a,2);
		System.out.printf("Kvadratas: %.4f \n", c);
		}
	

	public static void saknis(double a) {
		double c= Math.sqrt(a);
		System.out.printf("Saknis: %.4f \n", c);
	}
	
	
	public static void liekana(double a, double b) {
		double c= a%b;
		System.out.printf("Liekana: %.4f \n", c);
	}
	
	public static void ntuojuL(double a, double b) {
		double c=Math.pow(a,b);
		System.out.printf("ntuoju laipsniu: %.4f \n", c);
		
	}
	public static void procentai(double a, double b) {
		double c=(a/b)*100;
		System.out.printf("Procentai: %.4f \n", c);
	}
	
	public static void trigonometrija(String funk, double a) {
		if (funk=="sin") {
			double c = Math.sin(a);
			System.out.printf("Sinusas: %.4f \n", c);
		}
		else if (funk=="cos") {
			double c = Math.cos(a);
			System.out.printf("Kosinusas: %.4f \n", c);
		}
		else if (funk=="tan") {
			double c = Math.tan(a);
			System.out.printf("Tangentas: %.4f \n", c);
		}
		else if (funk=="cot") {
			double c = 1.0/Math.tan(a);
			System.out.printf("Kotangentas: %.4f \n", c);
		}
		
	}
}
