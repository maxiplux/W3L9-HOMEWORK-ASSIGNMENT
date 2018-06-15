package problem2;

public class Node {
	Object value;
	Node next;
	Node previous;
	public Node(Node previous,Object value,  Node next) {
		
		this.value = value;
		this.next = next;
		this.previous = previous;
	}
	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder();
		builder.append(this.value);
		if (this.next!=null)
		{
			builder.append(" >> Next --> "+String.valueOf(this.next.value));
		}
		
		if (this.previous!=null)
		{
			builder.append(" >> Previous -- > "+  this.previous.value);
		}
		
		
		return builder.toString();
	}
	
	
	

}
