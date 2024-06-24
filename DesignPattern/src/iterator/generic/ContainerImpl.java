package iterator.generic;

public class ContainerImpl<T> implements Container<T> {

//	String[] strArray = {"Hello", "Iterator", "Pattern"};
	T[] array;
	
	public void setArray(T[] array) {
		this.array = array;
	}
	
	@Override
	public Iterator<T> getIterator() {
		// Iterator interface 를 구현한 객체를 return
		return new IteratorImpl();
	}

	private class IteratorImpl implements Iterator<T> {

		int index; // default 0
		
		@Override
		public boolean hasNext() {
			if (index < array.length) return true;
			return false;
		}

		@Override
		public T next() {
			if (this.hasNext()) return array[index++];
			return null;
		}
		
	}
}
