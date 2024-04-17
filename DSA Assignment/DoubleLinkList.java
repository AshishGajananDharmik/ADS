class DoubleLinkList{

		Node head;
		static class Node{
			Node prev;
			int data;
			Node next;
			
			Node(int d)
			{
			   data=d;
			   prev=null;
			   next=null;
			
			}

			}
		void insert(int data)
		{
			Node new_node=new Node(data);
			if(head==null)
			{
				head=new_node;
				
				}else if(head!=null)
				{
					
					new_node.next=head;
					head.prev=new_node;
					head=new_node;
					new_node.prev=null;
				}
		}

		void insertAtPostion(Node h,int d,int postion)
		{
				Node temp=null;
				Node new_node=new Node(d);
				if(h==null)
				{
					h=new_node;
					}else if(head!=null)
					{	int i;
						for(i=1;i<postion;i++)
						{
							temp=h;
							h=h.next;
					
						}
						if(i==postion)
						{
							new_node.next=temp.next;
							new_node.prev=temp;
							temp.next=new_node;
							new_node.next.prev=new_node;
				
						}
					}
			}
						void display(Node h)
			{
				Node n=null;

				if(h==null)
				{
					System.out.println("Linklist is empty");
				}else{
					while(h!=null)
					{

						System.out.println(h.data);
						n=h;
						h=h.next;
					}
					System.out.println("--------");
					System.out.println("Backward printing:");
					while(n != null)
					{
						System.out.print(n.data+ " ");
						n=n.prev;
			
					}

				
				     }
				

			}
			void deletenode(Node n)
			{
		//base condition
		if(head == null || n == null)
		{
			return;
		}
		//deletion at the begining
		if(head == n)
			head=n.next;
			//head.prev=null;
		// deletion in between two elements
		if(n.next != null)
			n.next.prev = n.prev;
		if(n.prev != null)
			n.prev.next=n.next;
		
		return;
		
		
	}

			public static void main(String args[])
			{
				DLL d1 = new DLL();
				d1.insert(5);
				d1.insert(10);
				d1.insert(15);
				d1.display(d1.head);
				System.out.println();
				d1.insertAfter(d1.head, 7);
				d1.display(d1.head);

				d1.deletenode(d1.head);
				d1.display(d1.head);

			}
		
					
	}

		
		