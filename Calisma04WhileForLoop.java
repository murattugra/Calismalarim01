package Calismalarim01;

import java.util.Scanner;

public class Calisma04WhileForLoop {

	public static void main(String[] args) {

		// kullanicidan toplanmak uzere sayi isteyin
		// kullanici sifira basincaya kadar sayilari alip
		// toplamaya devap edin
		// kullanici sifira bastiginda,
		// o ana kadar sifir haric kac sayi girdigini ve girilen sayilarin toplamini
		// yazdirin

		Scanner scan = new Scanner(System.in);

		int sayi = 10;
		int toplam = 0;
		int sayac = 0;

		while (!(sayi == 0)) {
			System.out.println("Lutfen Toplamak icin entere basarak  sayilar girin");
			sayi = scan.nextInt();
			toplam += sayi;
			sayac++;

		}

		System.out.println("Girdiginiz Sayi Adedi : " + (sayac - 1));
		System.out.println("Girdiginiz Sayilarin Topami :" + toplam);
	}

}
