package gt.edu.url.examen2.problema3;
/**
 * 
 * @author Giovanni
 *
 */
public class Main {

	public static void main(String[] args) {
		LinkedPositionalList<String> poList = new LinkedPositionalList<>(); 
		Position<String> ob0, obj1,obj2,obj3,obj4; 
		obj1 = poList.addFirst("1"); 
		obj2 = poList.addFirst("2"); 
		obj3 = poList.addFirst("3"); 
		obj4 = poList.addFirst("4"); 
		
		
		
		
		System.out.println(obj1.getElement());
		System.out.println(obj2.getElement());
		System.out.println(obj3.getElement());
		System.out.println(obj4.getElement());
		
		
		poList.swap(obj1, obj2);
		String recorrer = null;
		
		do{
		            try{
		                Position<String> tempPosition = poList.first();
		                recorrer = poList.remove(tempPosition);
		                System.out.println(recorrer);
		            }
		            catch(Exception e){
		                System.out.println("No hay mas datos de la lista");
		                recorrer =null;
		                break;
		            }
		        }
		while(recorrer != null);  

	}

}
