
	public class Car {
		
		public String marka;
		public String model;
		public String yakit_turu;
		public int yakit_deposu;
		
		
		
		public String getMarka(){

			return marka;
		}
		
		public void setMarka(String newMarka){		
			this.marka=newMarka;       // this.marka  değilde marka yapsaydık 		
		}
		
		public Car(String markaname, String modelname, String yakitturu, int yakitdeposu){	
			marka=markaname;
			model=modelname;
			yakit_turu=yakitturu;
			yakit_deposu=yakitdeposu;
		}
		
		public Car(){		
			// Default Constructor		
		}
		
		public Car(String yakitturu,int yakitdeposu){		
			yakit_turu=yakitturu;
			yakit_deposu=yakitdeposu;		
		}
		
		public void printdetail(){
			
			System.out.println("Brand :"+ this.marka +" - Model :"+this.model+ " - Type_of_oil : "+ this.yakit_turu +" -  Oil Size lt :"+this.yakit_deposu );
		}
	
}

	
