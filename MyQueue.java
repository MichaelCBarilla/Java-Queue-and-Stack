
public class MyQueue<T> {
	
	//Fields
	private T[] data;
	private int front;
	private int rear;
	private int size;
	private int numOfNodes;
	
	//Constructors
	MyQueue() {
		front = 0;
		rear = 0;
		size = 100;
		data = (T[]) new Object[100];
		numOfNodes = 0;
	}
	
	MyQueue(int s) {
		front = 0;
		rear = 0;
		size = s;
		data = (T[]) new Object[s];
		numOfNodes = 0;
	}
	
	//Methods
	public boolean enqueue(T newObject) {
		if (numOfNodes == size) {
			return false;
		} else {
			GenericNode newNode = (GenericNode) newObject;
			numOfNodes++;
			data[rear] = (T) newNode.deepCopy();
			rear = (rear + 1) % size;
			return true;
		}
	}
	
	public T dequeue() {
		if (numOfNodes == 0) {
			return null;
		} else {
			GenericNode newNode = (GenericNode) data[front];
			numOfNodes--;
			front = (front + 1) % size;
			return (T) newNode;
		}
	}
	
	public void showAll() {
		int i = front;
		for (int c = 0; c < numOfNodes; c++) {
			System.out.println(data[i].toString());
			i = (i + 1) % size;
		}
	}
}
