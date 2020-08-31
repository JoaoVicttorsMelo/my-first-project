public class facebook {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			facebook.teste(i);
		}

	}

	public static void teste(int num) {

		boolean cont = (num % 2 == 0) ? true : false;
		if (cont == true) {
			System.out.println("your number " + num + ": evens ");

		} else {
			System.out.println("your number " + num + ": odds ");
		}

	}

}
