
public class Arrayswap {
	
	public static void main(String[] args){
		
		
		
		int[] arr = new int[]{ 9,3,4,6,7,1,19,15,10,2};
		int[] swaparr=new int[10];
		
		System.out.print("Array'ýn 4. elemaný "+ arr[3]+" ");
		System.out.println("Arrayýn uzunluðu  "+ arr.length);
		for(int i=0; i<arr.length;i++){
		    System.out.print(arr[i]+"-");	
		}
		
		
		int min=arr[0];
		int max=arr[0];
		

		
		for(int i=0;i<arr.length;i++){
			
			
			if(arr[i]<min){
				
				min=arr[i];
				
			}
			
			if(arr[i]>max){
				
				max=arr[i];
				
			}
			
			
		}
		
	
		
		
		System.out.println("\nArraydeki en küçük deðer  ---->" + min );
		System.out.println("Arraydaki en büyük deðer  ---->"+ max);
		
		
	
		
		for(int i=0; i<arr.length;i++){
			
			if(arr[i]==min){
				
				arr[i]=arr[0];
				arr[0]=min;
			}
			
			if(arr[i]==max){
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=max;
			}
			
				
			
		}
		
	for(int i=0; i<arr.length;i++){
			
			
		    System.out.print(arr[i]+"-");
				
			
		}
		
		
		
		
	}

}
