package gt.edu.url.examen2.problema3;
/**
 * 
 * @author Giovanni
 *
 * @param <E>
 */
public class LinkedPositionalList<E> implements PositionalList<E> {
	
	private Node<E> header = null;// Referencia
	private Node<E> trailer = null;
	private int size = 0;
/**
 * Constructor para la lista posicional
 */
	public LinkedPositionalList() {
		header = new Node<>(null, null, null);
		trailer = new Node<>(null, header, null);
		header.setNext(trailer);
	}
/**
 * Validar si el valor ingresado existe en la lista
 * @param p
 * @return
 * @throws IllegalArgumentException
 */
	private Node<E> validate(Position<E> p) throws IllegalArgumentException {
		if (!(p instanceof Node))
			throw new IllegalArgumentException("P invalido");
		Node<E> node = (Node<E>) p; // safe cast
		if (node.getNext() == null)
			throw new IllegalArgumentException("p ya no se encuentra en la lista");
		return node;
	}
	/**
	 * Metodo que nos retorna la posicion del nodo
	 * @param node
	 * @return
	 */
	private Position<E> position(Node<E> node) {
		if (node == header || node == trailer)
			return null; // do not expose user to the sentinels
		return node;
	}
/**
 * nos retorna el valor del tamaño de la lista
 */
	public int size() {return size;}
/**
 * Determina si la lista esta vacia o no
 */
	public boolean isEmpty() {return size == 0;}
/**
 * Retorna el siguiente de header, osea el nodo inicio
 */
	public Position<E> first( ) {
		return position(header.getNext());
	}
/**
 * 
 */
	public Position<E> last( ) {
		return position(trailer.getPrev());
	}
	
	public Position<E> before(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return position(node.getPrev());
	}

	public Position<E> after(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return position(node.getNext());
	}
	
	
	private Position<E> addBetween(E e, Node<E> pred, Node<E> succ) {
		Node<E> newest = new Node<>(e, pred, succ);
		pred.setNext(newest);
		succ.setPrev(newest);
		size++;
		return newest;
	}
	
	public Position<E> addFirst(E e) {
		return addBetween(e, header, header.getNext());
	}

	@Override
	

	public Position<E> addLast(E e) {
		return addBetween(e, trailer.getPrev(), trailer);
	}
	
	public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException{
		Node<E> node = validate(p);
		return addBetween(e, node.getPrev(), node);
	}
	
	public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException{ 
		Node<E> node = validate(p);
		return addBetween(e, node, node.getNext());
	}

	public E set(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		E answer = node.getElement();
		node.setElement(e);
		return answer;
	}
	
	public E remove(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		E answer = node.getElement();
		node.setElement(null);
		node.setNext(null);
		node.setPrev(null);
		return answer;
	}

	@Override
	public void swap(Position<E> p, Position<E> q) {
		Node<E> P = validate(p); 
		Node<E> Q = validate(q); 
		E pivot1 = P.getElement(); 
		E pivot2 = Q.getElement();
		P.setElement(pivot1);
		Q.setElement(pivot2);
		
	}

	
	
		
			
	 }


