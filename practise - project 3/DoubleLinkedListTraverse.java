package Assisted;

class Node2{
	int data;
	Node2 prev;
	Node2 next;
}

class DoubleLinkedList{
	Node2 head=null;
	Node2 tail=null;
	int size=0;
	
	public void insertNode(int value) {
		Node2 node=new Node2();
		node.data=value;
		if(head==null) {
			node.prev=null;
			node.next=null;
			head=node;
			tail=node;
		}
		else {
			Node2 temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
			node.prev=temp;
			node.next=null;
			tail=node;
			
		}
	}

	public void traverseForward() {
		Node2 temp=head;
		while(temp.next!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println(temp.data);
		
	}

	public void traverseBackward() {
		
		Node2 temp=tail;
		while(temp.prev!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.prev;
		}
		System.out.println(temp.data);
	}


public class DoubleLinkedListTraverse
{
	public static void main(String[] args) {
		DoubleLinkedList dll=new DoubleLinkedList();
		dll.insertNode(5);
		dll.insertNode(26);
		dll.insertNode(16);
		dll.insertNode(98);
		dll.insertNode(75);
		System.out.print("Traversing forward is ");
		dll.traverseForward();
		System.out.print("Traversing backward is ");
		dll.traverseBackward();
		
	}
}

}
