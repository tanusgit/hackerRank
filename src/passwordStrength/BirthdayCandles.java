package passwordStrength;

public class BirthdayCandles {
	public static void main(String[] args) {
		int[] ar = { 1, 2, 4, 4 };
		int res = birthdayCakeCandles(ar);
		System.out.println(res);
	}

	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
			if (max == ar[i]) {
				count++;
			}
		}
		return count;

	}
}
