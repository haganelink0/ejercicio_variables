package fase3;

public class Main {

	public static void main(String[] args) {
		
		int firstLeapYear = 1948;
		int yearOfBirth = 1987;
		boolean isLeapYear = true;
		int difference = yearOfBirth - firstLeapYear;
		
		for (int i = 0; i < difference; i++) {
			firstLeapYear++;
			if (firstLeapYear % 4 == 0) {
				isLeapYear = true;		
			} else {
				isLeapYear = false;			
			}
			if (isLeapYear) {
				System.out.println("El año " + firstLeapYear + " es bisiesto.");
			} else {
				System.out.println("el año " + firstLeapYear + " no es bisiesto.");
			}
		}
		


	}

}
