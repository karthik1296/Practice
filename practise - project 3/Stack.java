package Assisted;

class Node3
{
	public int data;
	public Node3 next;
}
class LinkedList
{
	public Node3 head=null;
	public int size=0;
	
	public void push(int value) 
	{
		Node3 newNode=new Node3();
		newNode.data=value;
		newNode.next=null;
		if(head==null) 
		{
			head=newNode;
		}
		else 
		{
			Node3 temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
				
			}
			
			temp.next=newNode;
			
		}
		size++;
	}
	public void traverseList()
	{
		Node3 temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		
		System.out.println();
	}
		
	
	public void pop()
	{
		Node3 temp=head;
		if(size==0) 
		{
			System.out.println("stack underflow");
		}

		else if(size==1)
		{
			System.out.println(head.data+" is popped");
			head=null;
			size--;
		}
		else
		{
			for(int i=0;i<size-2;i++) 
			{
				temp=temp.next;
			}
			
			System.out.println(temp.next.data+" is popped");
			temp.next=null;
			size--;
		}
	}
}

public class Stack 
{
	public static void main(String[] args) {
		
		LinkedList stack=new LinkedList();
		stack.push(26);
		stack.push(13);
		stack.push(5);
		stack.push(8);
		stack.traverseList();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
	}

}
