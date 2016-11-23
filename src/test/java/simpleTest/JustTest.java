package simpleTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

import junit.framework.Assert;
//import mock.ToTest;
public class JustTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List myMockedList = Mockito.mock(ArrayList.class);  
		Mockito.when(myMockedList.get(Mockito.anyInt())).thenReturn(5);  
        Mockito.when(myMockedList.isEmpty()).thenReturn(false);  
          
        System.out.println(myMockedList.get(1));  
        System.out.println(myMockedList.isEmpty()); 
	}
	
	@Test
	public void testMethodTestMe(){
		List myMockedList = Mockito.mock(ArrayList.class);  
		Mockito.when(myMockedList.get(Mockito.anyInt())).thenReturn(5);  
        Mockito.when(myMockedList.isEmpty()).thenReturn(true);
       // ToTest t1 = new ToTest();
       // t1.testMe();
	}

}
