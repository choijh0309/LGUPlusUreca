package iterator.generic;

public class Test {

	public static void main(String[] args) {
		ContainerImpl<String> container = new ContainerImpl<>();
		String[] strArray = {"Hello", "Iterator", "Pattern"};
		container.setArray(strArray);
		
		Iterator<String> iter = container.getIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		ContainerImpl<Integer> container2 = new ContainerImpl<>();
		Integer[] intArray = {1, 3, 4, 6, 7,};
		container2.setArray(intArray);
		
		Iterator<Integer> iter2 = container2.getIterator();
		while (iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		
	}

}
