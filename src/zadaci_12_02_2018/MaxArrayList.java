package zadaci_12_02_2018;

import java.util.*;

public class MaxArrayList {

	static Scanner unos = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(7);
		list.add(8);
		list.add(43);
		list.add(9);
		list.add(1);
		list.add(0);
		list.add(67);
		list.add(33);
		list.add(5);
		list.add(2);
		list.add(14);
		list.add(20);

		if(max(list)==null){
			System.out.println("Lista je prazna.");
		}else{
		System.out.println("Najveci clan liste je: " + max(list));
	}
	}
	
	
	public static Integer max(ArrayList<Integer> list) {

		if (list.isEmpty()) {
			
			return null;
			
		} else {
			
			int max = list.get(0);
			for (int e : list) {
				if (e > max) {
					max = e;
				}
			}

			return max;

		}
	}
}
