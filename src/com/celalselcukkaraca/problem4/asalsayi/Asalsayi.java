package com.celalselcukkaraca.problem4.asalsayi;

import java.util.Scanner;

public class Asalsayi {
	
	public static void main(String[] args){
		
		int baslangic=20;
		
		int bulunanasalsayiadeti=0;
		
  	 	while(bulunanasalsayiadeti<3){
			
		
  	 	 for(int i=2; i<baslangic;i++){
			  
			  if(baslangic%i==0){
				  
				  System.out.println("Girdi�iniz say� asal de�ildir ..." + baslangic + ":(((((");
				  break;
			  }
			  else {
				  
				  System.out.println("Girilen say�  "+ baslangic +" ASAL SAYIDIR ****");
				  bulunanasalsayiadeti=bulunanasalsayiadeti+1;
				  break;
				  
			  }
			  
			  
		  }
  	 	 
  	 	baslangic=baslangic+1;
  	 	
  	 		
  	 		
  	 		
			
		}      
		
	
	/**	  System.out.println("Bir Say� giriniz ");
		  Scanner scan=new Scanner(System.in);
		  int sayi=scan.nextInt();
		  
		  for(int i=2; i<sayi;i++){
			  
			  if(sayi%i==0){
				  
				  System.out.print("Girdi�iniz say� asal de�ildir ...");
				  break;
			  }
			  else {
				  
				  System.out.println("Girilen say� ASAL SAYIDIR ****");
				  break;
				  
			  }
			  
			  
		  }   **/
		
			 
			 
			 
			 
		 }
		
		
		
	}


