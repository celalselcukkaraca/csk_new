
public class ArraySort {
	
	public static void main(String[] args){
		
		int[] arr = new int[]{ 9,3,4,6,7,1,19,15,10,2};
		
		printArray(arr);
		System.out.println("Arrayýn ortalamasý : "+ findAverage(arr));
		selectionSort(arr);
		System.out.println("Arrayýn Medyaný : " +findMedian(arr) );
		
	}
	
	public static void printArray(int array[]){
		
		for(int i=0;i<array.length;i++){
			
			System.out.print(array[i]+"-");
	
			
		}		
			System.out.println(" ");
	}
	
	public static double findAverage(int array[]){
		
		double sum=0;
		double average;
		
		for(int i=0;i<array.length;i++){
			
			sum=sum+array[i];
			
			
		}
		average=sum/array.length;
		
		return average;
		
	}
	
	
	public static void selectionSort(int array[]){
		
	
		
		//int[] temparr=new int[array.length];
		for(int i=0; i<array.length;i++){
			
			int min_index=i;
				
			
			for(int j=i+1;j<array.length;j++){
				
				
				if(array[j]<array[i]){
					
					min_index=j;  //min deðeri bulundu 
					
				}
				
				int temp=array[min_index];
				array[min_index]=array[i];
				array[i]=temp;
				
			
			}
			
			
					
			
		}
			printArray(array);
		
	
	}
	
	public static double findMedian(int array[]){
		
		double median=0;
		selectionSort(array);
		if(array.length%2==0){
			
			median=array[array.length/2]+array[(array.length/2)+1];
		}
		else 
			median=array[(array.length-1)/2];
		
		return median;
		
	}
	
	
	
}
