package Assisted;

class Node4{
	public int data;
	public Node4 next;
}
class Queue{
	public Node4 head=null;
	public int size=0;
	
	public void push(int value) {
		Node4 newNode=new Node4();
		newNode.data=value;
		newNode.next=null;
		if(head==null) {
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
			
		}
		size++;
	}
	public void traverseList() {
		Node4 temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println();
	}
		
	
	public void pop() {
		Node4 temp=head;
		if(size==0) {
			System.out.println("queue underflow");
		}

		else if(size==1) {
			System.out.println(head.data+" is popped");
			head=null;
			size--;
		}
		else {
			for(int i=0;i<size-2;i++) {
				temp=temp.next;
			}
			System.out.println(temp.next.data+" is popped");
			temp.next=null;
			size--;
		}
	}
}

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue queue=new Queue();
		queue.push(26);
		queue.push(13);
		queue.push(5);
		queue.push(8);
		queue.traverseList();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		
	}
}

