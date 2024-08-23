package priorityQueue;

public class Driver {

	public static void main(String[] args) {
		
		//Create a new heap object of numbers
		PriorityQueue<Number> queue = new PriorityQueue<Number>();
		
		//The higher the number the closer to the front of the line they are placed
		
		//Numbers added to queue
		Number one = new Number(1);
		Number five = new Number(5);
		Number two = new Number(2);
		Number three = new Number(3);
		Number seven = new Number(7);
		Number four = new Number(4);
		Number six = new Number(6);
		
		//Test if queue is empty
		System.out.println("Is the queue empty before adding values: " + queue.isEmpty());
		
		//Insert those string values into the queue
		queue.add(one);
		queue.add(five);
		queue.add(two);
		queue.add(three);
		queue.add(seven);
		queue.add(four);
		queue.add(six);
		
		System.out.println("\nAdd numbers 1, 5, 2, 3, 7, 4, 6\n");
		
		//Test if queue is empty after adding values
		System.out.println("Is the queue empty after adding values: " + queue.isEmpty());
		
		//Peek at what number is at the front of the line
		System.out.println("\nResult of Peek: " + queue.peek().getNumber());
		
		//Remove seven from queue
		queue.poll();
		
		//Peek at what number is at the front of the line
		System.out.println("Result of Peek after top value removed: " + queue.peek().getNumber());	
	}

}
