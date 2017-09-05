
public class CircularQueueTwo<Item> {
	public static int MAX_ARRAY_SIZE = 10;
	Item[] ring;
	int front = -1;
	int rear = -1;

	CircularQueueTwo() {
		ring = (Item[]) new Object[MAX_ARRAY_SIZE];

	}
	private boolean isRotated(){
			return front>rear;
	}

	public boolean isFull(){
		return  isRearReachedFront()&&(calculateFreeSpace()==0);
	}
	
	public boolean isRearReachedFront(){
		return (ring[front%MAX_ARRAY_SIZE]==ring[((rear+1)%MAX_ARRAY_SIZE)]);
	}
	private int calculateFreeSpace(){
		int rearFreeSpace = MAX_ARRAY_SIZE - (rear+1);
		int frontFreeSpace = Math.abs(0-front);
		return rearFreeSpace + frontFreeSpace;
	}
	private boolean isEmpty(){
		return ((front==-1)&&(rear==-1)); 
	}
	public void enqueue(Item item) {
		if(front ==-1){
			front++;
		}
		if(!isEmpty() &&isFull()){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		++rear;
		ring[rear % MAX_ARRAY_SIZE] = item;
		System.out.println("Free Space After "+calculateFreeSpace());

	}

	public void printQueue(){
		System.out.println("Printing Contents");
		for(int x = front ; x<=rear;x++){
			System.out.print(" "+ring[x%MAX_ARRAY_SIZE].toString());
		}
		System.out.println();
	}
	
	public Item dequeue() {
		System.out.println("front :" + front +" rear :"+rear);
		if(isEmpty() || isRotated()){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		Item returnValue = ring[front % MAX_ARRAY_SIZE];
		front++;
		//System.out.println("Free Space After "+calculateFreeSpace());
		return returnValue;
	}

}
