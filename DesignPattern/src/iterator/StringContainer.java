package iterator;

public class StringContainer implements Container {

	String[] strArray = {"Hello", "Iterator", "Pattern"};
	
	@Override
	public Iterator getIterator() {
		// Iterator interface 를 구현한 객체를 return
		return new StringIterator();
	}

	private class StringIterator implements Iterator {

		int index; // default 0
		
		@Override
		public boolean hasNext() {
			if (index < strArray.length) return true;
			return false;
		}

		@Override
		public Object next() {
			// 사용자가 hasNext() 후 호출
//			return strArray[index++];
			
			// 좀 더 안전한 방법
			if (this.hasNext()) return strArray[index++];
			return null;
		}
		
	}
}
