import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
			
		ArrayList<Car> car_list=new ArrayList<Car>();
		
		Car a=new Car("Ford","Transit","benzin",32);
		car_list.add(a);
		Car b=new Car("Honda","Civic","Benzin+lpg",48);
		car_list.add(b);
		Car c=new Car("Mercedes","C500","benzin",53);
		car_list.add(c);
		
		int answer=0;
		
		while(answer!=4){
		
			System.out.println("1-Ekle ");
			System.out.println("2-Ara� Ara "); // model ismine g�re 
			System.out.println("3-Ara� Listele ");
			System.out.println("4-��k�� ");
			
			Scanner scan=new Scanner(System.in);
			answer= scan.nextInt();
			
			if(answer==1){
				
				boolean eklemekistiyorum=true;
				
				while(eklemekistiyorum==true) {
					System.out.println("L�tfen ara� bilgilerini giriniz....");
					
					System.out.println("Hangi Marka?");
					String answer_marka= scan.next();
					
					System.out.println("Hangi Model?");
					String answer_model= scan.next();
					
					System.out.println("Hangi Yak�t T�r� ?");
					String answer_yakitturu= scan.next();
					
					System.out.println("Hangi Yak�t Deposu B�y�kl��� ka� lt ?");
					int yakit_deposu= scan.nextInt();
				
					System.out.println("*********Ba�ka bir ara� eklemek istiyor musunuz ?  E- Evet H- Hay�r *************");
					char devammi= scan.next().charAt(0);
				
					if(devammi=='E'|| devammi=='e'){
						eklemekistiyorum=true;	
					}else{
						eklemekistiyorum=false;
					}
				
					Car customerCar=new Car(answer_marka,answer_model,answer_yakitturu,yakit_deposu);
					System.out.println("M��terinin se�ti�i arac�n �zellekleri ");
					customerCar.printdetail();
				
					car_list.add(customerCar);
				}
				
				System.out.println("Araba listesi........");
				for(int i=0; i<car_list.size(); i++){
					car_list.get(i).printdetail();
				}
				//System.out.println("car_list ArrayListinin size'� "+car_list.size());			
				
			}	//if (answer==1) in kapan�� parantezi 
			
		
			if(answer==2){
				
				System.out.println("L�tfen aramak istedi�iniz arac�n modelini yaz�n�z ");
				Scanner scanner=new Scanner(System.in);
				String  girilenModelAdi=scanner.next();
				
				for(int i=0;i<car_list.size();i++){	
					if(car_list.get(i).model.equals(girilenModelAdi)){
						car_list.get(i).printdetail();					
					}
				}
					
				System.out.println("�stedi�iniz ara� modeli bulunamamaktad�r ...");			
				
			}// if(answer==2) in kapan�� parantezi 
			
			if(answer==3){
				
				System.out.println("Araba listesi........");
				for(int i=0; i<car_list.size(); i++){
					car_list.get(i).printdetail();
				}
			}
			
			if(answer==4){
				
				System.out.println("Sistemden ��k�� yapt�n�z....");
			}
		
		}	//main loop while

	} //end of main method
	

}
