import java.io.*;
import java.util.ArrayList;

public class MyStack <T> {
	ArrayList<T> stack;
	
	public MyStack <T> {
		stack = new ArrayList<T>();
	}
	
	public add (T value) {
		stack.add(value);
	}
	
	public T pop() throws ArrayIndexOutOfBoundsException {
		if(stack.isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		else {
			return stack.get(stack.size()-1);
		}
	}
	
	public T max() throws ArrayIndexOutOfBoundsException {
		if(stack.isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		else {
			T max = stack.get(0);
			T temp;
			for(int i = 0; i<stack.size(); i++) {
				temp = stack.get(i);
				if (temp > max) {
					max = temp;
				}
			}
			return max;
		}
	}
}