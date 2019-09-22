package com.cskaraca;

import java.util.Scanner;

public class csk_new_p1 {
	
	public static void main(String[] args){

	   
		System.out.println("Please enter  University Name ");
	    
		Scanner scan=new Scanner(System.in);
		String universityname= scan.nextLine();
		
		System.out.println("Girilen üniversite ismi :  " + universityname);
		System.out.println("Girilen üniversite isminin uzunluðu  :  " + universityname.length());
		System.out.println("Lütfen bir sayý giriniz, ona göre þifreleme olacaktýr...");
		
		int girilensayi=scan.nextInt();
		System.out.println("Girilen Sayý  " + girilensayi);
		
		String newname="";
		char newchar;
		char paswchar;
		for(int i=0; i<universityname.length();i++){
			
			//System.out.println(i);
			newchar=universityname.charAt(universityname.length()-1-i);
			//System.out.println("Þifrelisiz karekterin deðeri "+ (universityname.charAt(i)+0));
			//System.out.println("Þifreli karekter'in deðeri "+ (universityname.charAt(i)+girilensayi));
		    paswchar = (char)(universityname.charAt(i)+girilensayi);
		    //System.out.println(" xxx"+ paswchar);
			
			newname=newname+" "+paswchar;
			//System.out.print("newname " + newname);
			
		}
		
		System.out.println("Þifrelenerek oluþturulmuþ Üniversite adý ----->  "+ newname +" <-------");
		System.out.println("Tersten boþluklu  oluþan Üniversite adýnýn uzunluðu :  " +newname.length() );
		
	    }
	
	
}
