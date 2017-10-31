package gt.edu.url.examen2.problema2;

/**
 * 
 * @author Giovanni
 *
 * @param <E>
 */
public class DemostracionLista<E> implements List<E>
{
	public static final int CAPACITY=1;
	private E[ ] data;
	private int size = 0;
/**
 */
	public DemostracionLista() {
		this(CAPACITY); 
	}
/**
 * 
 * @param capacity
 */
	public DemostracionLista(int capacity) {
		data = (E[]) new Object[capacity];
	}
/**
 * Metodo que nos retorna el tamaño de la lista
 */
	public int size() {
		return size;
	}
/**
 * Retorna un valor de true o false dependiendo de si la lista esta vacia
 */
	public boolean isEmpty() { 
		return size == 0;
	}

	/**
	 * Obtiene el elemento de cierto index del cual nosotros querramos obtener el valor
	 */
	public E get(int i) {
		//checkIndex(i, size);
		return data[i];
	}
/**
 * Determina el valor a ingresar en un index determinado
 */
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
        /**
         * Remover Datos de cierto index
         */
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
