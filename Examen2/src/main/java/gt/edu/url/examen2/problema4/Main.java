package gt.edu.url.examen2.problema4;

import gt.edu.url.examen2.problema4.LinkedPositionalList;

public class Main {

	public static void main(String[] args) {
		LinkedPositionalList<String> poList = new LinkedPositionalList<>(); 
		poList.addFirst("1");
		poList.addFirst("2");
		poList.addFirst("3");
		poList.addFirst("4");
		poList.addFirst("5");
	
		System.out.println(poList.positionAtIndex(4).getElement());
	}

	

}
