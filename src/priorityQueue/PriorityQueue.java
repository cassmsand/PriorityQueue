package priorityQueue;

public class PriorityQueue<E extends Comparable>{
	
	//instance variable
	private MaxHeap<E> heap;
	
	//constructor
	public PriorityQueue() {
		//create a heap with max 7 entries
		heap = new MaxHeap(7);
	}
	
	//Add an entry to the Queue
	public void add(E element) {
		heap.insert(element);
	}
	
	//Remove an entry from the Queue - front of the line
	public E poll() {
		E removedElement = heap.remove();
		return removedElement;
	}
	
	//See what entry is front of the line
	public E peek() {
		E frontEntry = heap.peek();
		return frontEntry;
	}
	
	//is the line empty?
	public boolean isEmpty() {
		return heap.isEmpty();
	}
	
	
}
