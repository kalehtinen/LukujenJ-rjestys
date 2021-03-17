package öTentti;

import java.util.ArrayList;
import java.util.Scanner;

public class LukujenJarjestys {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> luvut = new ArrayList<Integer>();
		int lukujenMaara = 9;

		System.out.println("Syötä kymmenen kokonaislukua: ");
		while (lukujenMaara >= 0) {
			int luku = input.nextInt();
			luvut.add(luku);
			lukujenMaara--;
		}

		boolean kasvava = true;
		boolean vaheneva = true;

		for (int i = 0; i < luvut.size() - 1; i++) {
			if (luvut.get(i) > luvut.get(i + 1)) {
				kasvava = false;
			} else {
				vaheneva = false;
			}
		}
		String jarjestys = "";
		if (kasvava) {
			jarjestys = "kasvavassa järjestyksessä.";
		} else if (vaheneva) {
			jarjestys = "laskevassa järjestyksessä.";
		} else {
			jarjestys = "epäjärjestyksessä.";
		}
		System.out.println("Luvut ovat " + jarjestys);
	}

}
