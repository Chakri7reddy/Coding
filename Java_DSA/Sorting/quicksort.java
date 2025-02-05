/* Quick Sort in Java */

public class quicksort {
    
    static int partition(int[] num, int i, int j)
    {
        
        int pivot = num[(i+j)/2];
        
        
        while(i < j)
        {
            
            while(num[i] < pivot)
            {
                i++;
            }
            
           
            while(pivot < num[j])
            {
                j--;
            }
            
            
            if(i <= j)
            {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                
                
                i++;
                j--;
            }
        }      
        return i;
    }
    
    
    static void quicksort(int[] num, int i, int j)
    {
        int pivot_index = partition(num, i, j);
        
        
        if(i < pivot_index-1)
        {
            quicksort(num, i, pivot_index-1);
            
        }
        
       
        if(pivot_index < j)
        {
            quicksort(num, pivot_index, j);
           
        }

    }

	public static void main (String[] args) {
	//	int[] num = {5,3,3,7,3,2,1,9,11,4};
        int[] num={6,4,4,8,4,3,2,10,12,5};
		
		
		System.out.println("Unsorted array:");
		for(int i: num)
		{
		    System.out.print(i + " ");
		}
		
		quicksort(num, 0, num.length-1);
		
		
		System.out.println("\nSorted array:");
		for(int i: num)
		{
		    System.out.print(i + " ");
		}	
	}
}
