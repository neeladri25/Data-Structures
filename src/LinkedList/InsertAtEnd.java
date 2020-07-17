package LinkedList;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class InsertAtEnd {

	static Node insert(Node head, int data) {
		if(head == null)
			return new Node(data);
		
		Node temp = new Node(data);
		Node last = head;
		while(last.next!=null) {
			last = last.next;
		}
		last.next=temp;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null;
		head = insert(head,8);
		head = insert(head,9);
		head = insert(head,10);
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}

	}

}
