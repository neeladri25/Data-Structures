package LinkedList;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class InsertAtHead {
	static Node insertAtHead(Node head, int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = null;
		head =  insertAtHead(head,5);
		head = 	insertAtHead(head,1);
		head =	insertAtHead(head,2);
		head = 	insertAtHead(head,3);
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

}
