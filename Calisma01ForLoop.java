package Calismalarim01;

import java.util.Scanner;

public class Calisma01ForLoop {

	public static void main(String[] args) {
		//kullanicidan 2 tam sayi isteyin
		//ilk sayidan baslayarak ikinci sayiya kadar ucer,ucer yazdirin.
		//(ikinci sayi dahil olmak zorunda degil
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki tam sayi giriniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		if (sayi1>sayi2) {
			for (int i = sayi1; i > sayi2; i-=3) {
				System.out.println(i);
			}
	
		} else if(sayi1<sayi2) {

			for (int i = sayi1; i < sayi2; i+=3) {
				System.out.println(i);
			
		} 
	
	}	else {
		System.out.println("Sayilar esittir");
	}
scan.close();
	}
}
