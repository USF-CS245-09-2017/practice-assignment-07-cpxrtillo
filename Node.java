public class Node<T>{
	T data;
	Node next;

	public Node(T data){
		this.data = data;
		next = null;
	}

	public void set_data(T t){
		this.data = t;
	}

	public T get_data(){
		return this.data;
	}

	public void set_next(Node next){
		this.next = next;
	}

	public Node get_next(){
		return this.next;
	}
}
