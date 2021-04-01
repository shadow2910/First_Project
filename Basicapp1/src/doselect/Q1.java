package doSelect;

import java.util.*;

class ArrayListOps {
	public List<Integer> makeArrayListInt(int n) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(0);
		return list;
	}

	public List<Integer> reverseList(ArrayList<Integer> list) {
		Collections.reverse(list);
		return list;
	}

	public List<Integer> changeList(ArrayList<Integer> list, int m, int n) {
		Iterator<Integer> itr = list.iterator();
		List<Integer> modifiedList = new ArrayList<>();
		while (itr.hasNext()) {
			int x = itr.next();
			if (x == m)
				modifiedList.add(n);
			else
				modifiedList.add(x);
		}
		return modifiedList;
	}

}

public class Source {
	public static void main(String[] args) {
		System.out.println("No errors");
	}
}
