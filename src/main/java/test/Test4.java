package test;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Test4 {

	public static void main(String[] args) {
		List<Boolean> list = new ArrayList<>();
		list.add(true);
		list.add(false);
		list.add(true);
		
		for(Boolean b : list){
			System.out.println();
		}
		//StringUtils.contains(seq, searchSeq)
		System.out.println("true".equalsIgnoreCase(null));

	}

}
