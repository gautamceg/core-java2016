package program;

import java.util.Arrays;
import java.util.Scanner;

public class BhopalJailBreak {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int output = 0;
        int ip1 = Integer.parseInt(in.nextLine().trim());
        int ip2 = Integer.parseInt(in.nextLine().trim());
        int ip3_size = 0;
        ip3_size = Integer.parseInt(in.nextLine().trim());
        int[] ip3 = new int[ip3_size];
        int ip3_item;
        for(int ip3_i = 0; ip3_i < ip3_size; ip3_i++) {
            ip3_item = Integer.parseInt(in.nextLine().trim());
            ip3[ip3_i] = ip3_item;
        }
        output = GetJumpCount(ip1,ip2,ip3);
        System.out.println(String.valueOf(output));

	}
	public static int GetJumpCount(int input1,int input2,int[] input3)
    {
		int attempt =0;
		for(int i=0; i<input3.length ; i++){
			int wallHeight = input3[i];
			if(wallHeight == input1 || wallHeight < input1)
				attempt++;
			if(wallHeight > input1){
				attempt = attempt + doJump(input1, input2, wallHeight);
			}
			
		}
		return attempt;
    }
	
	public static int doJump(int jumpDistance, int slipDistance, int wallHeight){
		int attempt =0;
		int diffDistance = jumpDistance - slipDistance;
		int safePoint = wallHeight-jumpDistance;
		attempt = Math.floorDiv(safePoint,diffDistance) * 2 + 1;
		if(safePoint < diffDistance)
			attempt = attempt+1;
		return attempt;
	}
	public static int doJump1(int jumpDistance, int slipDistance, int wallHeight){
		int attempt =0;
		int diffDistance = jumpDistance - slipDistance;
		int safePoint = wallHeight-jumpDistance;
		int cal1 = safePoint * 2;
		if(cal1 != 0){
			if(cal1 % diffDistance ==0)
				attempt = Math.floorDiv(cal1,diffDistance);
			if(cal1 % diffDistance == cal1)
				attempt = attempt + 1;
			else
				attempt = Math.floorDiv(cal1,diffDistance)  + 1 ;
		}
		return attempt;
	}

}

/*Test Case
 * 4
 * 1
 * 5
 * 6
 * 9
 * 11
 * 4
 * 5
 * 
 */
