
class Node{
	int data;
	Node next;

	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
class Search{
	private Node head;

	public Search(){
		this.head=null;
	}

	public Node insert(int data){
		if(head == null){
			head = new Node(data);
		}
		else{
			//create new node
			Node temp = new Node(data);
			//New node points to head
			temp.next = head;


			//head poits to a new node
			head = temp;

		}
		return head;

	}

	public boolean iterativeSearch(int value){
		Node temp = head;
		boolean isFound = false;

		while(temp!=null){
			if(temp.data==value){
			isFound=true;
			break;
		}
		temp = temp.next;
	}
	return isFound;
}

public void print(){
	Node temp = head;
	while(temp!=null){
		System.out.print(temp.data+ "->");
		temp = temp.next;
	}
	System.out.print("null");
	System.out.println(" ");
}

public static void main(String[] args){
	Search search = new Search();
	search.insert(5);
	search.insert(8);
	search.insert(9);
	search.insert(15);

	search.print();

	System.out.println("Searching value 9 (Iterative)" + search.iterativeSearch(9));

}
}
