package Assisted;

class Node{
	int data;
	Node next;
}

class CircularLinkedListex{
	Node head=null;
	Node tail=null;
	int size=0;
	
	public void insertSorted(int value) {
		Node node=new Node();
		node.data=value;
		if(head==null) {
			node.next=null;
			head=node;
			tail=node;
			
			
		}
		else {
			Node temp=head;
			Node prev=null;
			int l=0;
			while(temp.next!=null && temp.data<value) {

				prev=temp;
				temp=temp.next;
				l++;
			}
			if(l==size-1) {
				tail.next=node;
				node.next=null;
				tail=node;
			}
			if(l==0 && temp.data>=value){
				node.next=temp;
				head=node;
			}
			else {
				node.next=null;
				tail=node;
				temp.next=node;
			}
			if(l>0 && l<size-1) {
				if(temp.data>=value) {
					prev.next=node;
					node.next=temp;
				}
				else {
					node.next=temp.next.next;
					temp.next=node;
				}
			}
		}
		size++;
	}
	
	public void traverseList() {
		Node temp=head;
		while(temp.next!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}



	


public class CircularLinkedList 
{
public static void main(String[] args) {
		
		CircularLinkedListex cLL=new CircularLinkedListex();
		cLL.insertSorted(55);
		cLL.insertSorted(65);
		cLL.insertSorted(75);
		cLL.insertSorted(26);
		cLL.insertSorted(96);
		cLL.insertSorted(16);
		cLL.traverseList();
		System.out.println(cLL.size);
		
	}

}
