package passwordStrength;

public class BirthdayCandles {
	public static void main(String[] args) {
		int[] ar = { 18, 20, 20, 20 ,90, 90, 13, 90, 75, 90, 8, 90, 43 };
		int res = birthdayCakeCandles(ar);
		System.out.println(res);
	}

	// retunrs the number of time the biggest element appears in the array list
	static int birthdayCakeCandles(int[] ar) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (max == ar[i]) {
				count++;
			}
		}

		return count;

	}
	
	
	
	static int birthdayCakeCandles2(int[] ar) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			int prevmax = max;
			if (ar[i] > max) {
				max = ar[i];
				count = 1;
			}
			if(prevmax == ar[i]) {
				count++;
			}
		}
		return count;

	}
}
