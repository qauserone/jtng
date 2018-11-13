package base.obj;
import base.abst.Object_test;
import base.implem.*;

public class Paso extends Object_test{
	private String name;
	private int id;
	private boolean repeat;
	private int NumRepeat;
	private String description;
	
	
	
		public Paso(String name, int id, boolean repeat, int NumRepeat) {
			super(name, id, repeat, NumRepeat);
			// TODO Auto-generated constructor stub
			

			name="Paso-generico";
			id=0;
			repeat=false;
			NumRepeat=0;
		}		
	
}
