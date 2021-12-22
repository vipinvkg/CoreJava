package Exercise_4;

public class SecondLargestNo_Array_16 {

	public static void main(String[] args) {
		
		int[] array = {50,54,89,5,222,27,87,777,35};
		  int temp;
		  for(int i = 0;i<array.length;i++) {
			  for(int j=i+1;j<array.length;j++) {
			  if (array[i] >array[j]) {
			  temp =array[j];
			  array[j] =array[i];
			  array[i]=temp;
				  
			  }
		  }
		  
		}
		  
		 System.out.println(array[array.length-2]);
		  }
	
	}

