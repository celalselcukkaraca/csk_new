package com.cskaraca;

import java.util.Scanner;

public class csk_new_p1 {
	
	public static void main(String[] args){

	   
		System.out.println("Please enter  University Name ");
	    
		Scanner scan=new Scanner(System.in);
		String universityname= scan.nextLine();
		
		System.out.println("Girilen �niversite ismi :  " + universityname);
		System.out.println("Girilen �niversite isminin uzunlu�u  :  " + universityname.length());
		System.out.println("L�tfen bir say� giriniz, ona g�re �ifreleme olacakt�r...");
		
		int girilensayi=scan.nextInt();
		System.out.println("Girilen Say�  " + girilensayi);
		
		String newname="";
		char newchar;
		char paswchar;
		for(int i=0; i<universityname.length();i++){
			
			//System.out.println(i);
			newchar=universityname.charAt(universityname.length()-1-i);
			//System.out.println("�ifrelisiz karekterin de�eri "+ (universityname.charAt(i)+0));
			//System.out.println("�ifreli karekter'in de�eri "+ (universityname.charAt(i)+girilensayi));
		    paswchar = (char)(universityname.charAt(i)+girilensayi);
		    //System.out.println(" xxx"+ paswchar);
			
			newname=newname+" "+paswchar;
			//System.out.print("newname " + newname);
			
		}
		
		System.out.println("�ifrelenerek olu�turulmu� �niversite ad� ----->  "+ newname +" <-------");
		System.out.println("Tersten bo�luklu  olu�an �niversite ad�n�n uzunlu�u :  " +newname.length() );
		
	    }
	
	
}
