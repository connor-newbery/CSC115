// Name: Connor Newbery
// Student number: V00921506

public class A3LinkedList implements A3List {
	private A3Node head;
	private A3Node tail;
	private int length;

	public A3LinkedList() {
		head = null;
		tail = null;
		length = 0;
	}

	public void addFront(String s) {
		A3Node n = new A3Node(s);
		if(head != null){
			n.next = head;
			head.prev = n;
		}
		else{
			tail = n;
		}
		head = n;
	}

	public void addBack(String s) {
		A3Node n = new A3Node(s);
		if(head == null){
			head = n;
		}
		else{
			tail.next = n;
			n.prev = tail;
		}
		tail = n;
	}

	public int size() {
		int length = 0;
		A3Node cur = head;
		while(cur != null){
			length++;
			cur = cur.next;
		}
		return length;
	}

	public boolean isEmpty() {
		if(size() == 0){
			return true;
		}
		return false;
	}

	public void removeFront() {
		A3Node cur = head;
		head = cur.next;
		cur = head;
	}

	public void removeBack() {
		A3Node cur = tail.prev;
		cur.next = null;
		tail = cur;

		}




	public void rotate(int n) {
		A3Node cur = head;
		for(int i = 0; i < n; i++){
		cur.prev = tail;
		tail.next = cur;
		head = cur.next;
		cur.next = null;
		head.prev = null;
		tail = cur;
		cur = head;
	}

	}

	public void interleave(A3LinkedList other) {
		A3Node cur1 = head;
		A3Node cur2 = other.head;
		A3Node temp1 = head.next;
		A3Node temp2 = other.head.next;
		while(cur1 != null && cur2 != null & temp1 != null && temp2 != null){
			cur1.next = temp2;
			temp2.prev = cur1;
			cur2.next = temp1;
			temp1.prev = cur2;

			cur1 = temp1;
			temp1 = temp1.next;
			cur2 = temp2;
			temp2 = temp2.next;
			}


		}




	/* Purpose: return a string representation of the list
	 *          when traversed from front to back
	 * Parameters: none
	 * Returns: nothing
	 */
	public String frontToBack() {
		String result = "{";
		A3Node cur = head;
		while (cur != null) {
			result += cur.getData();
			cur = cur.next;
		}
		result += "}";
		return result;
	}

	/* Purpose: return a string representation of the list
	 *          when traversed from back to front
	 * Parameters: none
	 * Returns: nothing
	 */
	public String backToFront() {
		String result = "{";
		A3Node cur = tail;
		while (cur != null) {
			result += cur.getData();
			cur = cur.prev;
		}
		result += "}";
		return result;
	}
}
