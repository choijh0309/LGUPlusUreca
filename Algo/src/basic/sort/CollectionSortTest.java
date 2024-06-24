package basic.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortTest {
	
	public static void main(String[] args) {
		List<Item> list = new ArrayList<>();
		list.add(new Item(3, "666"));
		list.add(new Item(2, "777"));
		list.add(new Item(5, "444"));
		list.add(new Item(3, "111"));
		// new Item(3, "666"), new Item(2, "777"), new Item(5, "444"), new Item(3, "111")
		
		System.out.println(list);
		
//		Collections.sort(list);
//		System.out.println(list);
		
		Collections.sort(list, (el1, el2) -> el1.itemId - el2.itemId);
		System.out.println(list);
		
		Collections.sort(list, (el1, el2) -> el1.itemNm.compareTo(el2.itemNm));
		System.out.println(list);
		
		Collections.sort(list, (o1, o2) -> o1.itemId == o2.itemId ? o1.itemNm.compareTo(o2.itemNm) : o1.itemId - o2.itemId);
		System.out.println(list);
	}
	
		static class Item implements Comparable<Item> {
			int itemId;
			String itemNm;
			
			Item(int itemId, String itemNm) {
				this.itemId = itemId;
				this.itemNm = itemNm;
			}

			@Override
			public String toString() {
				return "Item [itemId=" + itemId + ", itemNm=" + itemNm + "]";
			}

			@Override
			public int compareTo(Item o) {
//				return this.itemId - o.itemId; // itemId asc, 음수 this 가 앞.
//				return this.itemNm.compareTo(o.itemNm); // itemNm 기준
				// itemId 우선 비교 같으면 itemNm 비교
				return this.itemId == o.itemId ? this.itemNm.compareTo(o.itemNm) : this.itemId - o.itemId;
			}
		}

	}

