package edu.columbia.wl2271;

import java.lang.reflect.Constructor;

public class FieldVector {
	
	public enum Bit { ONE, ZERO };
	
	/**
	 * 
	 * @param size
	 */
	public FieldVector(int size) {
		vector = new boolean[size];
	}
	
	public void set(int index, Bit val)	{
		vector[index] = val == Bit.ONE?true:false;
	}
	
	public void flip(int index) {
		vector[index] = !vector[index];
	}
		
	@Override
	public String toString() {
		String out = "";
		for(int k = 0; k < vector.length; k++) {
			boolean val = vector[k];
			char add;
			add = val?'1':'0';
			out += add;
		}
		return out;
	}
	
	private boolean[] vector;
	
}
