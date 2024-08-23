package priorityQueue;

public class MaxHeap<E extends Comparable>{
	
	//instance variables
	private Object[] data;
	private int manyItems;
	
	//constructor
	public MaxHeap(int maxEntries) {
		data = new Object[maxEntries];
		manyItems = 0;
	}
	
	//insert a entry into the heap
	public void insert(E entry) {
		data[manyItems++] = entry;
		heapifyUp(manyItems - 1);
	}

	//Help for insert method
	private void heapifyUp(int index) {
		int parentIndex = (index - 1)/2;
		//if not at the root and the value at index is greater than it's parent value
		if ( index > 0 && ((E)data[index]).compareTo((E)data[parentIndex]) > 0) {
			E temp = (E)data[index];
			data[index] = data[parentIndex];
			data[parentIndex] = temp;
			heapifyUp(parentIndex);
		}
	}
	
	//remove the root from heap
	public E remove() {
		E output = (E)data[0];
		
		//item at end swapped with top
		data[0] = data[manyItems - 1];
		manyItems--;
		//move the value down until it's in the correct spot
		heapifyDown(0);
		return output;
	}

	//helper for remove method
	private void heapifyDown(int parent) {
		int largest = parent;
		int left = 2*parent + 1;
		int right = 2*parent + 2;
		
		if(left < manyItems && ((E)data[left]).compareTo((E)data[largest]) > 0){
			largest = left;
		}
		if(right < manyItems && ((E)data[right]).compareTo((E)data[largest]) > 0){
			largest = right;
		}
		if (largest != parent) {
			Object temp = data[largest];
			data[largest] = data[parent];
			data[parent] = temp;
		}
			
	}
	
	//peek method - see what value is at the root
	public E peek() {
		return (E)data[0];
	}
	
	//Check to see if the heap is empty
	public boolean isEmpty() {
		if (data[0] != null)
			return false;
		else return true;
	}
	
}
