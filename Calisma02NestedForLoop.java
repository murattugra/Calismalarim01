package Calismalarim01;

import java.util.Scanner;

public class Calisma02NestedForLoop {

	public static void main(String[] args) {
		// Kullanicidan 10'dan kucuk pozitif bir tamsayi girmesini isteyin
        // girdigi sayiya gore asagidaki sekli yazdirin
        // orn : 3 girilirse
        // 1
        // 1 2
        // 1 2 3
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 10 dan kucuk pozitif tam sayi giriniz");
		
		double sayi2=scan.nextDouble();
		int sayi=(int)sayi2;
		
		
		if (!(sayi>0 && sayi<10)) {
			System.out.println("Sayi 10 dan kucuk pozitif sayi olmalidir");
		} else {
			
			for (int i = 1; i <= sayi; i++) {
				
				for (int j = 1; j <=i; j++) {
					
					System.out.print(j+" ");
					
				}
				System.out.println("");
			}
	
		}		
				
		scan.close();
	}

}
