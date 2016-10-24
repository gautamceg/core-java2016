package program;

public class PrimeNoPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =11;
		getPrimes(11);
		System.out.println(getCountBraces("()()((()))()())"));
		

	}
	public static void getPrimes(int no){
		
		for(int i =2;i<=no;i++){
			int divideCount =0;
			for(int j=2; j<i;j++){
				if(i%j==0){
					divideCount++;
					break;
				}
			}
			if(divideCount == 0)
				System.out.print(" "+i);
		}
	}
	
	public static int getCountBraces(String s){
		char[] ch = s.toCharArray();
		int openCount =0;
		int closeCount =0;
		for(char c:ch)
		{
			if(c=='(')
				openCount ++;
			else if(c==')')
				closeCount++;
		}
		
		if(openCount == closeCount)
			return openCount;
		
		return -1;
	}

}
