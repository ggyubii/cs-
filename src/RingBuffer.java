
public class RingBuffer {
	 private int SIZE;
	 private int capacity;
	 private double[] ringBuffer;
	 private boolean filled;
	 
	 
	 RingBuffer(int capacity){
		 this.capacity=capacity;
		 ringBuffer = new double [capacity];
	 }
	 
 // return number of items currently in the buffer
	public int size() {
		
		int i = ringBuffer.length - 1; // start looking at the rightmost element in array 
		int numSize = 0; // start count at 0 
		while(i >= 0) {
			if(ringBuffer[i] != 0.0) {
				numSize++;
			}
			i--; // decreasing the index because we are looking through the array from right to left
		}
		return numSize;
	}
	 
	public boolean isEmpty() {
		return SIZE == 0;
		
		
		
	}
	public boolean isFull() {
		filled = SIZE == capacity;
		return SIZE == capacity;
	}
	
	
	
	
	public void dequeue(double x) {
		While (!isFull)
		
	}
	public void dequeue() {
		
	}
	
	
	 public double peek() {
		 
	 }
	 
	 public String toString() {
		 
	 }
}
