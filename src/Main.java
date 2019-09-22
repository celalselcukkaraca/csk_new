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
			System.out.println("2-Araç Ara "); // model ismine göre 
			System.out.println("3-Araç Listele ");
			System.out.println("4-Çýkýþ ");
			
			Scanner scan=new Scanner(System.in);
			answer= scan.nextInt();
			
			if(answer==1){
				
				boolean eklemekistiyorum=true;
				
				while(eklemekistiyorum==true) {
					System.out.println("Lütfen araç bilgilerini giriniz....");
					
					System.out.println("Hangi Marka?");
					String answer_marka= scan.next();
					
					System.out.println("Hangi Model?");
					String answer_model= scan.next();
					
					System.out.println("Hangi Yakýt Türü ?");
					String answer_yakitturu= scan.next();
					
					System.out.println("Hangi Yakýt Deposu Büyüklüðü kaç lt ?");
					int yakit_deposu= scan.nextInt();
				
					System.out.println("*********Baþka bir araç eklemek istiyor musunuz ?  E- Evet H- Hayýr *************");
					char devammi= scan.next().charAt(0);
				
					if(devammi=='E'|| devammi=='e'){
						eklemekistiyorum=true;	
					}else{
						eklemekistiyorum=false;
					}
				
					Car customerCar=new Car(answer_marka,answer_model,answer_yakitturu,yakit_deposu);
					System.out.println("Müþterinin seçtiði aracýn özellekleri ");
					customerCar.printdetail();
				
					car_list.add(customerCar);
				}
				
				System.out.println("Araba listesi........");
				for(int i=0; i<car_list.size(); i++){
					car_list.get(i).printdetail();
				}
				//System.out.println("car_list ArrayListinin size'ý "+car_list.size());			
				
			}	//if (answer==1) in kapanýþ parantezi 
			
		
			if(answer==2){
				
				System.out.println("Lütfen aramak istediðiniz aracýn modelini yazýnýz ");
				Scanner scanner=new Scanner(System.in);
				String  girilenModelAdi=scanner.next();
				
				for(int i=0;i<car_list.size();i++){	
					if(car_list.get(i).model.equals(girilenModelAdi)){
						car_list.get(i).printdetail();					
					}
				}
					
				System.out.println("Ýstediðiniz araç modeli bulunamamaktadýr ...");			
				
			}// if(answer==2) in kapanýþ parantezi 
			
			if(answer==3){
				
				System.out.println("Araba listesi........");
				for(int i=0; i<car_list.size(); i++){
					car_list.get(i).printdetail();
				}
			}
			
			if(answer==4){
				
				System.out.println("Sistemden Çýkýþ yaptýnýz....");
			}
		
		}	//main loop while

	} //end of main method
	

}
