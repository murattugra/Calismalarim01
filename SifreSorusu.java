package Calismalarim01;

import java.util.Scanner;

public class SifreSorusu {

	public static void main(String[] args) {
		/*
        Soru 5 ) Kullanicidan bir sifre girmesini isteyin. 
        Girilen sifreyi asagidaki sartlara gore kontrol edin 
        ve sifredeki hatalari yazdirin.
       Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin 
       ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
       - Sifre kucuk harf icermelidir
       - Sifre buyuk harf icermelidir
       - Sifre ozel karakter icermelidir
       - Sifre en az 8 karakter olmalidir.
        */
		
		
		Scanner scan=new Scanner(System.in);
		
		
		
		String sifre="";
		
		boolean khk;
		do {
			System.out.println("Lutfen bir sifre giriniz");
			sifre=scan.next();
			 khk=kucukharf(sifre);
			
		} while (!khk);
	}

	private static boolean kucukharf(String sifre) {
		boolean khk=false;
	
		
		
		return false;
	}

}
