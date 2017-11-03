
/*
 * Here we are creating a application to implement Linked List without using collections.
 * here we are creating a class Link list
 */
package list;//created package as list
public class LinkedList {//taken class name as LinkedList
//here  we taking the data type
	int x;  
	LinkedList next=null;
	//here we are creating the constructor
	public LinkedList(int x, LinkedList next)
	{
	//here we are refrencing the variable	
	this.x = x;  
	this.next = next; 
	}
//here we are creating the main method
	public static void main(String[] args)
	{
		// here we are Creating the  objects  
		LinkedList a = new LinkedList(25, null); 
		LinkedList b = new LinkedList(47, null);
		LinkedList c = new LinkedList(14, null );
		LinkedList d = new LinkedList(30, null);
		LinkedList e = new LinkedList(60,null);

	 //here we are Taking the  next reference from the current node 
      // and makes it the current element.
     
	a.next = b;  
	b.next = c;
	c.next=d; 
	d.next = e;

	System.out.print("Linked list: ");
	//here we re applying the condition to 
	//Using pointer to refer the address of the next element in the list
	for(LinkedList ptr = a; ptr!=null; ptr=ptr.next) 
	{
	System.out.print(ptr.x + " " );
	}
	
	}

	
	}

