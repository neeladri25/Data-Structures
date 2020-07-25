package LinkedList;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class InsertAtPosition {
	
	static Node insertAtPosition(Node head, int data, int pos) {
		if(pos==1) {
			Node newNode =new Node(data);
			newNode.next = head;
			head = newNode;
			return head;
		}
		Node newNode = new Node(data);
		Node temp = head;
		for(int i=0;i<pos-2;i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next=newNode;
		return head;
	}
	static void print(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		Node head = null;
		head = insertAtPosition(head,15,1);
		head = insertAtPosition(head,25,2);
		print(head);
	}

}
