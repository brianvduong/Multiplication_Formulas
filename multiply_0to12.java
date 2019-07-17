import java.util.Random;

public class multiply_0to12 {
	
	public static int generateNum1() {
		Random rand = new Random();
		int low = 0;
		int high = 40;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static int generateNum2() {
		Random rand = new Random();
		int low = 0;
		int high = 12;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static void main (String [] args) {
		int num1 = generateNum1();
		int num2 = generateNum2();
		
		if(num1 < 10 && num2 < 10) {
			System.out.println("  " + num1);
			System.out.println("x " + num2);
			System.out.println("----");
		}
		else if(num1 < 10 && num2 > 10) {
			System.out.println("   " + num1);
			System.out.println("x " + num2);
			System.out.println("-----");
		}
		else if(num1 > 10 && num2 < 10){
			System.out.println("  " + num1);
			System.out.println("x  " + num2);
			System.out.println("-----");
		}
		else {
			System.out.println("  " + num1);
			System.out.println("x " + num2);
			System.out.println("-----");
		}		
	}

}
