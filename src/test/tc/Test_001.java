package test.tc;
import obj.Paso;

public class Test_001  {

	public static void main(String[] args) {
		paso1();
		System.out.println("static void");
	}
	
	
	public static void paso1() {
		String name = null;
		boolean repeat = false;
		Paso Paso1=new Paso("Paso1", 1, false, 0);
		Paso1.getName();
		Paso1.getRepeat();
		String console = "salida por consola";
		Paso1.setConsole(console);
		Paso1.getConsole();
	}
}
