package forloop;

public class Reverseprime_forloop {

	public static void main(String[] args) {

		Reverseprime_forloop obj = new Reverseprime_forloop();
		obj.total(71);
		obj.total(81);

	}

	public void total(int i) {
		System.out.println("enter the number= " + i);
		int reverse = 0;
		for (; i > 0; i /= 10) {
			int a = i % 10;
			reverse = reverse * 10 + a;
		}
		int count = 0;
		for (int n = 1; n <= reverse; n++) {

			if (reverse % n == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(" is a  prime number");

		} else {
			System.out.println(" is a not prime number");
		}

	}
}