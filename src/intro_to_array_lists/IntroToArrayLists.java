package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		// 2. Add five Strings to your list
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("fifth");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n");
		// 4. Print all the Strings using a for-each loop
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("\n");
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < list.size(); i++) {
			if (i % 2 == 1) {
				System.out.println(list.get(i));
			}
		}
		System.out.println("\n");
		// 6. Print all the Strings in reverse order.
		for (int i = list.size(); i > 0; i--) {
			System.out.println(list.get(i - 1));
		}
		System.out.println("\n");
		// 7. Print only the Strings that have the letter 'e' in them.
		for (String j : list) {
			if(j.contains("e")) {
				System.out.println(j);
				
			}
		}

	}
}
