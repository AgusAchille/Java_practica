package pila_colas;

import java.util.LinkedList;

public class Cola<T>{
	LinkedList<T> cola = new LinkedList<T>();

	public void push(T elemento) {
		cola.addLast(elemento);
	}
	
	public T pop() {
		T first = cola.getFirst();
		cola.removeFirst();
		return first;
	}
}
