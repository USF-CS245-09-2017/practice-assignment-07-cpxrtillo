List Interface

- generalized version of stack or queue
- list -- 
+ add(T item): void
+ add(int pos, T item): void
+ get(int pos): T
+ remove(int pos): T
+ size(): int

List list = new...
list.add("Justine");
list.add(1, "Safya");
list.add("Kaleo");

Assert Class

Assert.not_false(...);

public class Assert {
	
	public static boolean not_false(boolean condition) { -- static: belongs to class, within the class, 
		if(cond) {
			return true;
		}
		throw new Exception("Error");
	}

	public class Node<T> {
		T data;
		Node next;

		public Node(T data) {
			this.data = data;
			next = null;
		}
		public void set_next(Node next) {
			this.next = next;
		}
	}
	public class LinkedList<T> implements List<T> {
		Node head = null;
		int size = 0;

		public int size() { // constant run time
			return size;		
		}
		public T get(int pos) { // O(n)
			Assert.not_false(pos > 0 && pos < size);
			Node current = head;

			for(int i = 0; i < pos; i++) {
				current = current.get.next();
			}
			return current.get.data();
		}
		public void add(T item) { // O(1)
			if (head == null) {
				Node<T> newNode = new Node(item); // create new node
				head = newNode; // connect head with node
				size++; // increment size
			}
			else {
				Node prev = head;
				for(int i = 0; i < size - 1; i++) {
					prev = prev.get.next();
				}
				Node<T> newNode = new Node(item); // create new node
				prev.set.next(newNode);
				size++;
			}
		} 
	}