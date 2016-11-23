package org.singleton;

public class MySingleton{
	private static MySingleton mySingleton;
	
	private MySingleton(){}
	
	public static synchronized MySingleton getInstance(){
		if(mySingleton==null)
			return new MySingleton();
		return mySingleton;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
