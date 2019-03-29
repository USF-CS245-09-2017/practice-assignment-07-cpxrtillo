public class LinkedList<T> implements List<T>{
	Node<T> head;
	int size;

	public LinkedList(){
		head = null;
		size = 0;
	}

	// get the data at the position
	public T get(int position){
		Node node = head;
		for(int i = 0; i < position; i++){
			node = node.get_next();
		}
		return node.get_data();
	}

	// add to end of list, if no head, make the new node head
	public void add(T t){

		// if there is no head, create one
		if(head == null){
			Node<T> newNode = new Node(t);
			head = newNode;
		} 

		// get to end of list, insert at end of list (size)
		else{
			Node<T> previous = head;
			
			for(int i = 0; i < size-1; i++){
				previous = previous.get_next();
			}
			Node<T> newNode = new Node(t);	
			previous.set_next(newNode);
		}

		// increment
		this.size++;
	}

	// return size
	public int size(){
		return this.size;
	}
	
	// add to specific position
	public void add(int position, T t){
		// create node to be head if nothing in list
        if (position == 0){
            Node<T> newNode = new Node(t);
            newNode.set_next(head);
            head = newNode;
            size++;
        }
        // increment through list until you get to desired position
        else{
            Node previous = head;
            for(int i = 0; i < position-1; i++){
                previous = previous.get_next();
            }

            // create new node at position
            Node<T> newNode = new Node(t);
            newNode.set_next(previous.get_next());
            previous.set_next(newNode);

            // increment
           this.size++;
        }
}

    // remove item from position in list
    public T remove(int position){
    	// just in case you need to remove the first and only item in list
        Node<T> previous = head;
        if(position == 0){
            head = head.get_next();
            this.size--;
            return previous.get_data();
        }

        // increment through list, get to desired position, delete item at given position, set previous to the node in front
        for(int i = 0; i < position-1; i++){
            previous = previous.get_next();
        }
        Node<T> removed = previous.get_next();
        previous.set_next(removed.get_next());

        // decrement
        this.size--;
        return removed.get_data();
    }
}