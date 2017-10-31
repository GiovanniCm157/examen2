package gt.edu.url.examen2.problema5;

import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E>{
	 private final int CAPACITY = 3;
	   private int top;  // indicates the next open slot
	   private E[] stack; 
        
	  
	   public ArrayStack()
	   {
	      top = 0;
	      stack = (E[])(new Object[CAPACITY]);
	   }

	   
	   public ArrayStack (int initialCapacity)
	   {
	      top = 0;
	      stack = (E[])(new Object[initialCapacity]);
	   }

	   
	   public void push (E element)
	   {
	      if (size() == stack.length) 
	         expandCapacity();

	      stack[top] = element;
	      top++;
	   }

	 
	   public E pop() throws EmptyStackException
	   {
	      if (isEmpty())
	         throw new EmptyStackException();

	      top--;
	      E result = stack[top];
	      stack[top] = null; 
	 
	      return result;
	   }

	 
	   public boolean isEmpty()
	   {
		return (top == 0);
	   }
	 
	  
	   public int size()
	   {
		return top;
	   }

	 
	   
	   private void expandCapacity()
	   {
	      E[] larger = (E[])(new Object[stack.length*2]);

	      for (int i=0; i < stack.length; i++)
	         larger[i] = stack[i];

	      stack = larger;
	   }



	public E top() {
		if (isEmpty())
	         throw new EmptyStackException();
		

	       return stack[top-1];
	}

}
