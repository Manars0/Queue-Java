package fourth;

public class Queue <T> {
	int capacity;
	int first;
	int size;
	T data [];
	
	Queue (int max){
		size=0; first = 0;
		capacity= max;
		data =(T[]) new Object[capacity];
	}
	// is empty
	boolean isEmpty() {
		if (size ==0 )
			return true;
		else
			return false;
	}
	//size
	int size() {return size;}
	//first
	T first () {
		if (isEmpty())
			return null;
		else 
			return data[first];
	}
	// Enqueue 
	void Enqueue (T item) {
		if (size == capacity)
			System.out.println("Queue is Full");
		else
		{int available = (first+ size) % capacity;
		data[available]=item;
		size++;}
	}
	//Dequeue
	T Dequeue () {
		if (isEmpty())
			return null;
		else
		{T value = data [first];
		data [first]=null;
		first = (first+1) % capacity;
		size --;
		return value;}
	}
	//clear
	void clear() {size=0; first=0;}
	// print
	void printQueue() {
		int index = first;
		for (int i=0; i<size; i++)
		{System.out.print(data[index]+" ");
		index = (index +1)%capacity;}
		System.out.println();
	}
	
	//find
	public boolean find (T item) {
		int index = first;
		for (int i=0; i< size; i++)
		{
			if (item == data[index])
				return true;
		index = (index+1) % capacity;	
		}
		return false; // out of for because if it deosn't found
	}//end find
	
	// Enqueue 
	void EnqueueNOdup (T item) {
		if (size == capacity)
			System.out.println("Queue is Full");
		else
			if (find(item))
				System.out.println("duplicate");
			else		
		{int available = (first+ size) % capacity;
		data[available]=item;
		size++;}
	}	
	
	
	

}
