package fileIO;

public class WriteToFixedLenghtFormatFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one = "abcd"; //length 4
		String two = "efghij"; //length 6
		String three = "klmnop"; //length 6
		String four = "qrs"; //length 3
		
		String formatted = String.format("%10s%8s%9s%10s", one, two, three, four);
		for(int i=1 ;i<=5;i++)
			System.out.println(formatted);
		
		String transactionType = "A";
	    String bac = "118697";
	    String businessFunctionCode = "1";
	    String bfuCode = "119";
	    String sellingSource = "11";
	    String filling = "";
	    
	    String format = String.format("", transactionType, bac, businessFunctionCode, bfuCode, sellingSource);

	}

}
