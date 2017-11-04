package mock;

import java.util.*;

public class ToTest {

	public void testMe(){
		List<Integer> myMockedList = new ArrayList();
		myMockedList.add(100);
		if(myMockedList.isEmpty()){
			System.out.println("Empty List in ToTest");
		}
		System.out.println("Exiting testMe");
		
	}
}
