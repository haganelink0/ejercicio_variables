package fase4;

public class Main {

	public static void main(String[] args) {
		String nom = "Anton";
		String cognom1 = "Lage";
		String cognom2 = "Magr�";
		String nomICognoms = nom + " " + cognom1 + " " + cognom2;
		int birthYear = 1987;
		int birthMonth = 9;
		int birthDay = 10;
		String birthDate = birthDay + "/" + birthMonth + "/" + birthYear;
		boolean leapYear = true;
		
		if (birthYear % 4 == 0) {
			leapYear = true;
		} else {
			leapYear = false;
		}
		
		System.out.println("El meu nom es " + nomICognoms);
		System.out.println("Vaig n�ixer el " + birthDate);
		if (leapYear) {
			System.out.println("El meu any de naixement �s de trasp�s.");
		}else {
			System.out.println("el meu any de naixement no �s de trasp�s.");
		}

	}

}
