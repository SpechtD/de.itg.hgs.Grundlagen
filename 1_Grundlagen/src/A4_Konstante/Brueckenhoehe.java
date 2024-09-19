package A4_Konstante;

import java.util.Scanner;

/**
 * Um die Konstanten aus einem Interface zuverwenden,
 * wird dieses �ber den Befehl implements zugaenglich gemacht.
 * Mit der Codevervollst�ndigung von Eclipse (Strg + Leertaste)
 * k�nnen die Konstanten dann ausgewaehlt und eingefuegt werden.
 * @author hr
 *
 */
public class Brueckenhoehe implements Physik{
	
	public static void main(String[] args) {

		//EINGABE
		double fallzeit, brueckenhoehe;
		fallzeit = 1.5; //sekunden	
				
		//VERABEITUNG
		//hier mit der Konstanten aus dem Interface Physik
		//s=1/2 a t�
		brueckenhoehe = 0.5 * NORMALFALLBESCHLEUNIGUNG * fallzeit*fallzeit;
		
		
		
		//AUSGABE
		System.out.print("Fallzeit:"+fallzeit);
		System.out.println(brueckenhoehe);
		
	}
}
