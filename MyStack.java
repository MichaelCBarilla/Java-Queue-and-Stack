
public class MyStack<T> {
	
	//Fields
	private T[] data;
	private int top;
	private int size;
	
	//Constructors
	MyStack() {
		top = -1;
		size = 100;
		data = (T[]) new Object[100];
	}
	
	MyStack(int s) {
		top = -1;
		size = s;
		data = (T[]) new Object[s];
	}
	//Methods
	public boolean push(T newObject) {
		if (top == size - 1) {
			return false;
		} else {
			GenericNode newNode = (GenericNode) newObject;
			top++;
			data[top] = (T) newNode.deepCopy();
			return true;
		}
	}

	public T pop() {
		if (top == -1) {
			return null;
		} else {
			int topLocation = top;
			top--;
			return data[topLocation];
		}
	}
	
	public void showAll() {
		for (int i = top; i >= 0; i--) {
			System.out.println(data[i].toString());
		}
	}
}
