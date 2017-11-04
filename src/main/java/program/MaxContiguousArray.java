package program;

import java.util.Arrays;
import java.util.Scanner;

public class MaxContiguousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Length= ");
		int n = sc.nextInt();
		int inputArray[] = new int[n];
		System.out.print("Enter Array elements= ");
		for(int i=0; i<n ; i++){
			inputArray[i]= sc.nextInt();
		}
		sc.close();
		//System.out.println("Maximum contiguous sum is " +maxSubArraySum(inputArray));
		
		findMaxSubArray(inputArray);
		

	}
	static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
	
	static void findMaxSubArray(int[] inputArray){

        int maxStartIndex=0;
        int maxEndIndex=0;
        int maxSum = Integer.MIN_VALUE; 

        int cumulativeSum= 0;
        int maxStartIndexUntilNow=0;
        		
        for (int i = 0; i < inputArray.length; i++) {
        	
            int eachArrayItem = inputArray[i];
            
            cumulativeSum+=eachArrayItem;

            if(cumulativeSum>maxSum){
                maxSum = cumulativeSum;
                maxStartIndex=maxStartIndexUntilNow;
                maxEndIndex = i;
            }
            else if (cumulativeSum<0){
            	maxStartIndexUntilNow=i+1;
            	cumulativeSum=0;
            }
        }
        

        System.out.println("Max sum         : "+maxSum);
        System.out.println("Max start index : "+maxStartIndex);
        System.out.println("Max end index   : "+maxEndIndex);
        
        int [] maxSubArray = Arrays.copyOfRange(inputArray, maxStartIndex, maxEndIndex);
        System.out.print("Max subArray :");
        for(int i=0; i < maxSubArray.length; i++){
        	System.out.print( maxSubArray[i] + ",");
        }
        
    }

}
