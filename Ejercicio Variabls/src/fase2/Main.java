package fase2;

public class Main {

	public static void main(String[] args) {
		
		int firstLeapYear = 1948;
		int amountOfLeaps = 0;
		int yearOfBirth = 1987;
		
		for (int i = 0; i < (yearOfBirth - firstLeapYear); i++) {
			if ((firstLeapYear+i) % 4 == 0) {
				amountOfLeaps++;
			}
		}
		
		System.out.println(amountOfLeaps);

	}

}
