package oop.test.kr.ssg.util;

public class IntArray {

	private int count;
	private int[] arr;
	
	/**
	 * Constructor without fields
	 */
	public IntArray() {
		// super();
		this(10);
	}
	
	public IntArray(int init) {
		arr = new int[init];
	}
	
	public void add(int data) {
		arr[count++] = data;
	}
	
	public int get(int index) {
		return arr[index];
	}
	
	public int size() {
		return count;
	}
}
