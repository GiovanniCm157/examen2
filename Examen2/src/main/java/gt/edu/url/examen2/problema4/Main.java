package gt.edu.url.examen2.problema4;

import gt.edu.url.examen2.problema4.LinkedPositionalList;

public class Main {

	public static void main(String[] args) {
		LinkedPositionalList<String> List = new LinkedPositionalList<>(); 
		List.addFirst("1");
		List.addFirst("2");
		List.addFirst("3");
		List.addFirst("4");
		List.addFirst("5");
	
		System.out.println(List.positionAtIndex(4).getElement());
	}

	

}
