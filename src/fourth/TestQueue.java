package fourth;

import java.util.Scanner;

public class TestQueue {
	public static void main (String[] args) {
	
		
		int x,t;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size:");
		x=s.nextInt();
		Queue <Integer> ob1 = new Queue<>(x);
		
		for (int i =1; i<=x ;i++ )//or i<size to save place
		{System.out.println("enter number :");
		t=s.nextInt();
		if (ob1.find(t))
			System.out.println("duplicate");
		else
			ob1.Enqueue(t);
		}
		ob1.printQueue();
		System.out.println("The Queue size is: "+ob1.size());
	
		
	}

}
