class Insertion{
Node head;
	static class Node{
				int data;
				Node next;
				Node(int a)
				{
					data=a;
					next=null;
				}


	
			}
	public void insertionBeginning(int n)
	{
		Node new_node=new Node(n);
		if(head==null){
		head=new_node;
		}else{
	
			new_node.next=head;
			head=new_node;

			}
	}
public void display(){
	Node temp=head;
	while(temp!=null)
	{
		System.out.println(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
}


public void insertionBetween(int n,int key)
{
	Node new_node=new Node(n);
Node perv=null;
Node temp=head;
	while(temp.next!=null && temp.data!=key)
	{
		perv=temp;
		temp=temp.next;
		

	}
	new_node.next=temp;
	perv.next=new_node;
}

public void insertionEnd(int n)
{
	Node new_node=new Node(n);
		Node temp=head;
	while(temp.next!=null)
	{
		temp=temp.next;

	}

	temp.next=new_node;
}


public void deleteBeginning()
{
	if(head==null)
	{
		System.out.println("Linklist empty");	
	}
	else{
		
		head=head.next;

	}
}

public void deleteEnd()
{ 	Node temp,prev;
	temp=head;
	prev=null;
	if(head==null)
	{
		System.out.println("Linklist empty");	
	}
	else{
		while(temp.next!=null)
		{
			prev=temp;
			temp=temp.next;
		}
	prev.next=null;
		
		

	}
}



public void deletePostion(int key)
{

Node perv=null;
Node temp=head;
	while(temp!=null && temp.data!=key)
	{
		perv=temp;
		temp=temp.next;
		

	}
	
	perv.next=temp.next;
	
}


	public static void main(String args[])
	{
	Insertion lt=new Insertion();
	lt.insertionBeginning(20);
	lt.insertionBeginning(30);
	lt.insertionBeginning(40);
lt.insertionEnd(45);
	lt.insertionBetween(35,30);
	 lt.deleteBeginning();

	lt.display();
 	lt.deleteEnd();
	lt.display();
	lt.deletePostion(30);
	lt.display();
}
	
	
	
			
	

}