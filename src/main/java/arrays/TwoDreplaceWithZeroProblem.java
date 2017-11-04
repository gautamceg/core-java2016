package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoDreplaceWithZeroProblem {

	public static void main(String[] args) {
		Map<Integer,Integer> zerothPositionMap = new HashMap<>();
		int inputArray[][] = {
				{1,1,1,1,1},
				{1,1,0,1,1},
				{1,0,1,1,1},
				{1,1,1,1,1},
				{1,1,1,1,1}
		};
		System.out.println("========== Input =============");
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				int item = inputArray[i][j];
				System.out.print(item+"\t");
				if(item == 0){
					zerothPositionMap.put(i, j);
				}
			}
			System.out.println();
		}
		System.out.println("zerothPositionMap" + zerothPositionMap);
		updateInput(inputArray, 0, zerothPositionMap);

	}
	
	static void updateInput(int inputArray[][], int targetElement, Map<Integer,Integer> zerothPositionMap){
		System.out.println("========== Output =============");
		int item =0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				for(Map.Entry<Integer, Integer> entry : zerothPositionMap.entrySet()){
					if(entry.getKey() == i){
						inputArray[i][j] = 0;
					}
					if(entry.getValue() == j){
						inputArray[i][j] =0;
					}
					item = inputArray[i][j];
				}
				
				System.out.print(item+"\t");
			}
			System.out.println();
		}
		
	}

}
