## Queue (Java Implementation)
A simple Queue Management System implemented in Java using a generic, circular array-based approach.
The program allows users to enqueue, dequeue, find, and clear elements interactively through a console-based test class.

## Purpose
This project demonstrates the core concept of the Queue data structure (FIFO — First In, First Out) and how to implement it efficiently using arrays and modular arithmetic.

## Features
- Generic type support (Queue<T>)
- Core operations:
  - Enqueue() — Add an element
  - Dequeue() — Remove an element
  - first() — Access the first element
  - find() — Search for an element
  - clear() — Reset the queue
- Duplicate-safe enqueue using EnqueueNOdup()
- Circular array logic for efficient memory use
- Simple, clean, and easy-to-understand code structure

## How It Works
When the program runs:
- The user specifies the queue size.
- The program allows inserting elements using Enqueue().
- If a duplicate element is entered, it prints “duplicate”.
- The user can print, remove, or inspect queue contents.

**Example Code**
`````
package fourth;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>(5);

        q.Enqueue("A");
        q.Enqueue("B");
        q.Enqueue("C");
        q.printQueue(); // A B C

        System.out.println("First element: " + q.first());
        System.out.println("Removed: " + q.Dequeue());
        q.printQueue(); // B C

        q.EnqueueNOdup("B"); // duplicate
        q.EnqueueNOdup("D");
        q.printQueue(); // B C D
    }
}
`````
**Example Console Output**
`````
A B C 
First element: A
Removed: A
B C 
duplicate
B C D 
`````
## Test Program (Interactive Mode)

The file TestQueue.java allows users to:
- Create a queue of any size
- Input elements manually
- Prevent duplicate entries
- Display queue contents and size

**Example:**
`````
enter size:
5
enter number :
10
enter number :
20
enter number :
10
duplicate
enter number :
30
enter number :
40
10 20 30 40
The Queue size is: 4
`````
## Technologies Used
- Java 17+
- Object-Oriented Programming (OOP)

## Author
**Manar Salem**  
Programming and Database Student  
[https://github.com/Manars](https://github.com/Manars)
