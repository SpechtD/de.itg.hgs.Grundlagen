package E5_Rucksackproblem;

public class Rucksack {

	//Gesamtvolumen des Rucksacks
	static int rVol = 30;
	
	//Volumina der einzelnen Gegenst�nde
	static int[] gVol = { 5, 5, 6, 9, 6, 11, 12, 15, 17, 30 };
	
	//Werte der einzelnen Gegenstnde
	static int[] gWert = { 7, 7, 6, 5, 10, 5, 14, 17, 20, 21 };
	
	
	//F�r dynamische Programmierung
	//Ergebnis f�r jeden Volumenwert speichern
	static int matrix[][];
	
	//Initialisieren der Matrix mit -1
	//-1 ist ein Wert, der bei den Gegenst�nden nicht vorkommen kann
	static int[][] initMatrix() {
		int[][] m = new int[rVol+1][gVol.length];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = -1;
			}
		}
		
		return m;
	}

	//rekursiver Algorithmus
	static int pack(int restVol, int i) {

		if (i < gVol.length) {
			
			
			if(matrix[restVol][i]!=-1) {
				return matrix[restVol][i];
			}
		
			// Nicht einpacken
			int nicht = pack(restVol, i + 1);

			//Einpacken
			int drin = 0;
			if (restVol - gVol[i] >= 0) {
				drin = gWert[i]+pack(restVol-gVol[i], i+1);
			}
			
			if(nicht>drin) {
				matrix[restVol][i]= nicht;
			}
			else {
				matrix[restVol][i] = drin;
			}
			return matrix[restVol][i];
		}

		return 0;
	}
	
	static void printGrid(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
	
	static void findG(int maxWert) {
		int aktWert = 0;
		for (int i = 0; i < matrix.length; i++) {
			if(matrix[i][0]==maxWert) {
				aktWert = i;
			}
		}
		
		for (int i = 0; i < gVol.length; i++) {
			if(aktWert-gVol[i]>= 0 && matrix[aktWert-gVol[i]][i+1]==matrix[aktWert][i]-gWert[i]) {
				System.out.println(i+" ");
				aktWert = aktWert-gVol[i];
			}
			
		}
		
	}

	public static void main(String[] args) {
		matrix = initMatrix();
		int erg = pack(rVol, 0);
		
		System.out.println(erg);

		printGrid(matrix);
		
		findG(erg);
	}
	
	
	
	

}
