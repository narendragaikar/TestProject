package com.narendra;

public class LinkedList {

	Node head;
	int count;
	public LinkedList(){
		this.head=null;
		this.count=0;
	}
	public LinkedList(Node head){
		this.head=head;
		this.count=1;
	}
	 public void addNode(int value) {
		 Node current=head;
		 Node temp=new Node(value);
		 
		 if(current==null){
			 this.head=temp;
			 count+=1;
			 return;
		 }
		 while(current.getNext()!=null){
			 current = current.getNext();
		 }
		 current.setNext(temp);
		 count += 1;
	 }

	 public void removeNode() {};

	 public int getCount() {
		return count;};

	 public Boolean isEmpty() {
		return null;};

	 public int get(int nodeNum) {
		 if (nodeNum <= 0) {
		        return -1;
		    }
		    Node current = head;
		    for(int i = 1; i < nodeNum; i++) {
		        current = current.getNext();
		    }
		    return current.getValue();
	};
	
}
