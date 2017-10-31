package gt.edu.url.examen2.problema2;
import gt.edu.url.examen2.problema2.DemostracionLista;

public class CrearDemoLista implements DemoList {

	@Override
	public List<Integer> crearDemoLista() {
        List<Integer> obj = new DemostracionLista<>();
		obj.add(0, 4);
		obj.add(0, 3);
		obj.add(0, 2);
		obj.add(2, 1);
		obj.add(1, 5);
		obj.add(1, 6);
		obj.add(3, 7);
		obj.add(0, 8);
		return obj;
	}

}
