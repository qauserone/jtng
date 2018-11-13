package test.paso;

import base.obj.Paso;

public class PasosFuncionalidadH {
	
	
	
	public static void paso1() {
//		String name = null;
//		boolean repeat = false;
		Paso Paso1=new Paso("Paso1", 1, false, 0);
		Paso1.getName();
		Paso1.getRepeat();
		String console = "salida por consola";
		Paso1.setConsole(console);
		Paso1.getConsole();
	}
	

}
