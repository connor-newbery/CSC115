/**********************
Connor Newbery
V00921506
**********************/




public class A4Stack<T> implements Stack<T> {

	private Node<T> head;

	public A4Stack() {
		head = null;
	}

	public void push(T v) {
		// TODO: implement this
		Node top = new Node(v);
		top.setNext(head);
		head = top;
	}

	public T pop() {
		if (isEmpty()) {
			// exception handling is done for you -- we will learn about
			// expections in the next unit. Don't change this.
			throw new EmptyStackException("Can't pop - stack is empty");
		}
		T temp = head.getData();
		Node hold = head;
		head = head.getNext();
		hold.setNext(null);
		return temp; // so it compiles
	}

	public void popAll() {
		// TODO: implement this
		if(!isEmpty()){
			head = null;
		}
	}

	public boolean isEmpty() {
		// TODO: implement this
		if(head == null){
			return true;
		}else{
		return false;
		} // so it compiles
	}

	public T top() {
		if (isEmpty()) {
			// exception handling is done for you -- we will learn about
			// expections in the next unit. Don't change this.
			throw new EmptyStackException("Can't pop - stack is empty");
		}
		// TODO: implement this

		return head.getData(); // so it compiles
	}
}
