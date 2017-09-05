
public class CircularQueue<Item> {
	public static int MAX_ARRAY_SIZE = 10;
	Item[] ring;
	int front=-1;
	int rear=-1;
	CircularQueue(){
		ring = (Item[]) new Object[10];
	
	}
	
	public void enqueue(Item item){

		if(isFull()){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(front==-1){
			++front;
		}
		++rear;
		ring[rear%MAX_ARRAY_SIZE] =item;
		
	}
	int calculateFreeSpace(){
		int freeSpace = 0;
		freeSpace = MAX_ARRAY_SIZE-1- ((front+rear)-1);
		return freeSpace;
	}
	
	boolean isFull(){
		System.out.println("free space"+calculateFreeSpace());
		return false;
	
		
	}
	boolean hasOneElementOnly(){
		return ((rear==0) &&(front==0));
	}
	boolean isEmpty(){
		boolean returnValue = false;
		if((front-1 == rear)){
			returnValue = true;
		}
		System.out.println("front :"+front +" rear : "+rear);
		return returnValue;
		
	}
	public Item dequeue(){
	if(isEmpty()){
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		Item returnValue = ring[front%10];
		front++;
		return returnValue;
	}
	
}
