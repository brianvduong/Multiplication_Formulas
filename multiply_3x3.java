import java.util.Random;

public class multiply_3x3 {
	public static int generateNum1() {
		Random rand = new Random();
		int low = 100;
		int high = 999;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static int generateNum2() {
		Random rand = new Random();
		int low = 100;
		int high = 999;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static void main (String [] args) {
		int number1 = generateNum1();
		int number2 = generateNum2();
		
		System.out.println("  " + number1);
		System.out.println("x " + number2);
		System.out.println("------");
			
	}

}
