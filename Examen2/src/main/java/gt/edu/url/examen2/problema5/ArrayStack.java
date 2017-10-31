package gt.edu.url.examen2.problema5;

import java.util.EmptyStackException;
/**
 * 
 * @author Giovanni
 *
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E>{
	 private final int CAPACITY = 3;
	   private int top;  // indicates the next open slot
	   private E[] stack; 
        
	  /**
	   * Constructor de nuestro arrayStack
	   */
	   public ArrayStack()
	   {
	      top = 0;
	      stack = (E[])(new Object[CAPACITY]);
	   }

	   /**
	    * 
	    * @param initialCapacity
	    */
	   public ArrayStack (int initialCapacity)
	   {
	      top = 0;
	      stack = (E[])(new Object[initialCapacity]);
	   }

	   /**
	    * Ingresa un elemnto a un stack
	    */
	   public void push (E element)
	   {
	      if (size() == stack.length) 
	         expandCapacity();

	      stack[top] = element;
	      top++;
	   }

	 /**
	  * Saca el primer elemento del stack y lo muestra
	  */
	   public E pop() throws EmptyStackException
	   {
	      if (isEmpty())
	         throw new EmptyStackException();

	      top--;
	      E result = stack[top];
	      stack[top] = null; 
	 
	      return result;
	   }

	 /**
	  * Mira si el valor es de verdadero o falso
	  */
	   public boolean isEmpty()
	   {
		return (top == 0);
	   }
	 
	  /**
	   * retorna el tamaño del stack
	   */
	   public int size()
	   {
		return top;
	   }

	 
	   /**
	    * hace un arreglo nuevo con el doble de tamaño que el anterior tenia y lo iguala al arreglo antiguo
	    */
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
