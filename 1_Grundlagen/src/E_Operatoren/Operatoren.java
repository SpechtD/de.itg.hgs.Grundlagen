package E_Operatoren;

public class Operatoren {

	public static void main(String[] args) {
		// Deklaration
		String str_z1, str_z2;
		String lsg_a, lsg_b, lsg_c;
		int z1, z2, a, b, c;

		// Bin�re Zahlen als Strings
		str_z1 = "1111";
		str_z2 = "1001";

		// Umwandeln in ganze Zahlen
		z1 = Integer.parseInt(str_z1, 2);
		z2 = Integer.parseInt(str_z2, 2);

		// logisch Verkn�pfen
		a = z1 & z2;
		b = z1 | z2;
		c = z1 ^ z2;

		// Umwandeln Bin�rzahl als String
		lsg_a = Integer.toBinaryString(a);
		lsg_b = Integer.toBinaryString(b);
		lsg_c = Integer.toBinaryString(c);

		System.out.println(lsg_a);
		System.out.println(lsg_b);
		System.out.println(lsg_c);

	}

}
