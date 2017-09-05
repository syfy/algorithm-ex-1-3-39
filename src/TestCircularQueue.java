
public class TestCircularQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueueTwo cq = new CircularQueueTwo();
			cq.enqueue(1);
			cq.enqueue(2);
			cq.enqueue(3);
			cq.enqueue(4);
			cq.enqueue(5);
			cq.enqueue(6);
			cq.enqueue(7);
			cq.enqueue(8);
			cq.enqueue(9);
			cq.enqueue(10);
		
			cq.printQueue();
			cq.dequeue();
			cq.printQueue();
			cq.enqueue(11);
			cq.printQueue();
			cq.dequeue();
			cq.dequeue();
			cq.printQueue();

			cq.enqueue(12);
			cq.printQueue();


	}

}
