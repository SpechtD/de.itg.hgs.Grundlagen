package G5_LoginKeygenerator;

import java.util.ArrayList;

public class Login {

	public static void main(String[] args) {
		// Teste login mit Quersumme 15
		System.out.println(login("x002"));
		System.out.println(login("y001"));
		System.out.println(login("z000"));
		System.out.println(login("6801"));
		System.out.println(login("9213"));

		generateLoginKeys("x002");

	}

	public static boolean login(String key) {

		boolean loginOk = false;

		// L�nge pr�fen
		if (key.length() != 4) {
			return false; // Abbruch
		}
	 
		// Pr�fen obe Pr�fsumme stimmt
		// Minimale Pr�fsumme = 48+48+48+48 = 192 -> 0000
		// Maximale Pr�fsumme = 122+122+122+122 = 488 -> zzzz
		// System.out.println(summeASCIIZahlen);

		if (getPruefsumme(key) == 266) {
			loginOk = true;
		}

		return loginOk;
	}

	public static void generateLoginKeys(String code) {

		int summeASCIIZahlen = getPruefsumme(code);
		System.out.println("Pr�fsumme des Codes ist:" + summeASCIIZahlen);

		// Finde alle Kombinationen f�r welche die Quersumme
		// von 4 Zahlen = x ist und gebe sie aus

		//Liste f�r zu erstellende LoginKeys
		ArrayList<Integer> keys = new ArrayList<Integer>();
		int ziffern[] = {48,49,50,51};
		
		

	}

	private static int getPruefsumme(String code) {
		// Den String in einzelne charwerte umwandeln
		// um an den ASCII Code zu kommen
		char[] chars = code.toCharArray();

		// Aus den charwerten die ASCII Code Werte ermitteln
		// 0 -> 48, 1 -> 49 ...
		// A -> 65, B -> 66 ...
		// a -> 97, b -> 98 ...
		int[] asciiValues = new int[chars.length];
		int summeASCIIZahlen = 0;
		
		for (int i = 0; i < chars.length; i++) {
			asciiValues[i] = chars[i];

			summeASCIIZahlen = summeASCIIZahlen + asciiValues[i];
		}
		return summeASCIIZahlen;
	}

}
