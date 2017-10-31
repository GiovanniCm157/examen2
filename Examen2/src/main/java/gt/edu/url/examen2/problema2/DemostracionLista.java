package gt.edu.url.examen2.problema2;


public class DemostracionLista<E> implements List<E>
{
	public static final int CAPACITY=1;
	private E[ ] data;
	private int size = 0;
	

	public DemostracionLista() {
		this(CAPACITY); 
	}

	public DemostracionLista(int capacity) {
		data = (E[]) new Object[capacity];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() { 
		return size == 0;
	}

	public E get(int i) {
		//checkIndex(i, size);
		return data[i];
	}

	public E set(int i, E e) {
		//checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	public void add(int i, E e) {       // parametro (e) es el objeto de cuaquier tipo a recibir          
		//checkIndex(i, size);
		if (size >= data.length) // not enough capacity
			throw new IllegalStateException("Array is full");
                 else{
                  for (int k=0; k <= i; k++) {
                  if (data[k]== null) {
                       data[k] =e;
                       data[size] = e; 
                       size++;                      
                       }
                     }
                   }        
                 }
        
        public E remove( int i ) throws IndexOutOfBoundsException {
		//checkIndex(i, size);
		E temp = data[i];
		for (int k=i; k < size-1; k++)
			data[k] = data[k+1];
		data[size-1] = null;
		size--;
		return temp;
        }
}
