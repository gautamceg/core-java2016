package fileIO;

import org.apache.commons.lang3.StringUtils;

public class TestLpad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("Stated");
		String str = StringUtils.leftPad("Gautam", 10, "0");
		buffer.append(str);
		buffer.append(StringUtils.leftPad("Srini", 40, "1"));
		System.out.println(buffer);
	}

}
