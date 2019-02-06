package pila_colas;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		//Pila
		Stack<Integer> pila = new Stack<Integer>();
		
		System.out.println("-----PILA-----");
		
		pila.push(7);
		pila.push(222);
		pila.push(15);
		pila.push(9);
		pila.push(963);
		
		System.out.println("El último número de la pila es: " + pila.peek());
		
		//mientras la pila no esté vacía
		while( pila.empty()==false )
			System.out.println(pila.pop()); //sacamos elementos de la pila.
		
		/////////////////////////////////////////////////////////////////////////////
		
		//Cola
		LinkedList<Integer> cola = new LinkedList<Integer>();
		
		System.out.println("-----COLA-----");
		
		cola.offer(5);
		cola.offer(7);
		cola.offer(9);
		cola.offer(10);
		
		System.out.println(cola.peek());
		
		while(cola.isEmpty()==false)
			System.out.println(cola.poll());
		
	}

}
