package g_generic_classes;

public class ArrayListAgus<T> {
	private T[] object_array;
	private int i=0;
	
	public ArrayListAgus(int x) {
		object_array = (T[]) new Object[x];
	}
	
	public T get(int i) {
		return object_array[i];
	}
	
	public void add(T item) {
		object_array[i]=item;
		i++;
	}
	
	
	
}
