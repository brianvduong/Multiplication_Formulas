import java.util.Random;

public class multiply1 {
	
	public static void main (String [] args) {
		
		Random rand = new Random();
		int low = 0;
		int high = 9;
		int result = rand.nextInt(high - low) + low;
		int num1 = 1;
		
		System.out.println("  " + result);
		System.out.println("x " + num1);
		System.out.println("----");
	}
	
}
