package A6_Operatoren;
/*
Einfache uebungen
zu Operatoren
*/

public class A61_Operatoren_Einfuehrung {

	public static void main(final String[] args) {

		// u1:
		// Deklarieren Sie die Zahl 255 als Hexadezimalzahl
		// und geben Sie diese aus
		// Was stellen Sie fest?
		// 1011`1100 = 0xBC = 11*16^1+10*16^0
         int hexadezimalZahl=0x10BC; //BC ist ein Nibble belegt 1 Byte
         System.out.println("\nDie Hexadezimalzahl:"+hexadezimalZahl);

		//Zahlen aus Text         
         String hex = "0A";
         int hexZahl = Integer.parseInt(hex, 16); //Wrapperklasse -> Integer
		 System.out.println("hexZahl = "+hexZahl);

		 String strKommzahl1 = "2.9"; //Wrapperklasse -> Double
		 double kommaZahl = Double.parseDouble(strKommzahl1);
		 System.out.println("Kommazhl="+kommaZahl);

		 
      

		// u2:
		// Reihenfolge der Auswertung in Ausdruecken
		// Welchen Wert hat b?
		// Begruenden Sie das Ergebnis.
		int a=5;
		int b=3;
		++a;   // a -> hat den Wert 6 (preinkrement) gleich wie a=a+1; a+=1
		a=b++; //a hat den Wert von b = 3, dannach wird b erhöht (postinkrement)
		System.out.println("\na: " +a);
		System.out.println("b: " +b);

		// u3
		// Welchen Wert hat z4? Begruenden Sie Ihr ergebnis.
         int a4=13;     //1101
         int b4=11;     //1011 
         int z4 = a4&b4;//1001
         System.out.println("\nz4 "+z4);











		// u4:
		// Welchen Wert hat z5? Begruenden Sie Ihr Ergebnis.
         int a5=11;  //1011
         int b5=9;   //1001
         int z5;     //1011  
         
         z5=a5|b5; //binäres ODER
         System.out.println("\nz5 "+z5);








		// u5:
		// Welche Ergebnisse ergeben sich bei den Pruefsummen 1-4?

         boolean pruefSumme1,pruefSumme2,pruefSumme3,pruefSumme4;
         int a6 = 9;
         int b6 = 99;
         pruefSumme1 = a6!=10 && b6>10; //logisches UND
         pruefSumme2 = a6<10 || b6>10;  //logisches ODER
         pruefSumme3 = a6<10 && b6<10;
         pruefSumme4 = a6<10 || b6<10;
         System.out.println("\npruefSumme1 "+pruefSumme1);
         System.out.println("pruefSumme2 "+pruefSumme2);
         System.out.println("pruefSumme3 "+pruefSumme3);
         System.out.println("pruefSumme4 "+pruefSumme4);
         
         
		 

//         

		// uebung 7:
		// Anwenden mathematischer Methoden aus der Klasse Math.*
//         double pi = Math.PI;
//         double wi1 = Math.sin(pi);  //=0
//         double wi2 = Math.cos(pi/2);
//         
//         
//         
//         double alpha = (wi2*360.0) / (2.0*pi);
//         System.out.println(alpha);   
//         
//         
//         double wi3 = Math.sin(pi/4);
//         double wi4 = Math.cos(pi);
//         double wi5 = Math.cos(pi/2);
//         double wi6 = Math.cos(pi/4);
//
//         System.out.println("\nwi1 "+ wi1);
//         System.out.println("wi2 "+ wi2);
//         System.out.println("wi3 "+ wi3);
//         System.out.println("wi4 "+ wi4);
//         System.out.println("wi5 "+ wi5);
//         System.out.println("wi6 "+ wi6);
//         

		// uebung 8: Schreiben Sie ein Programm zur Berechnung eines Winkels
		// aus einem Bogenmass

//         //UeBUNG 9
		//int zahl = 15238;
		//int komplement = ~15238 + 1;

		//System.out.println(zahl);
		//System.out.println(komplement);

	}//ende main
}//ende class
