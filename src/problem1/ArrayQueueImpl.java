package problem1;


public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;

	public int peek() {

		if (isEmpty()) {
			System.out.println("Peek Failed. Becuase the array Queue is Empty");
			return 0;
		}

		return this.arr[front + 1];
	}

	public void enqueue(int obj) {

		if (this.size() - 1 == this.rear) {

			this.resize();

		}

		this.arr[this.rear] = obj;
		this.rear++;

	}

	public int dequeue() {
		
		this.front++;
		if (this.isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int value = this.arr[this.front];
		this.arr[this.front] = 0;
		return value;

	}

	public boolean isEmpty() {

		return this.rear == -1 || this.rear == this.front;
	}

	public int size() {
		// implement
		return this.arr.length;
	}

	private void resize() {
		// implement
		int[] dest_arr = new int[this.arr.length + 10];
		System.arraycopy(this.arr, 0, dest_arr, 0, arr.length);
		this.arr = dest_arr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		int i = this.front + 1;

		while (i < this.rear)

		{
			builder.append(this.arr[i] + ",");
			i++;

		}
		return " Queue<" + builder.toString() + ">\n";
	}

	public static void main(String[] args) {
		ArrayQueueImpl print_queue = new ArrayQueueImpl();

		for (int i = 5; i < 10; i++) {

			print_queue.enqueue(i);
		}
		System.out.printf("Our status on print queue %s", print_queue);

		System.out.printf("What is our peek ? -- > %s \n", print_queue.peek());

		for (int i = 0; i < 6; i++) {

			int element = print_queue.dequeue();
			if (element==-1)
			{
				System.out.printf("Ups  fail on dequee , the value on iteration %s is  [%s] \n", i,  element);
			}
			else
			{
				System.out.printf("We remove a element on  %s and the value is %s \n", i,  element);
			}
			
		}
		System.out.printf("After remove elements  the new state of queue is  %s \n", print_queue);

	}
}
