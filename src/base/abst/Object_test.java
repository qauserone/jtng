package base.abst;
import base.interf.Common;

public abstract class Object_test {
	private String name;
	private int id;
	private boolean repeat;
	private int NumRepeat;
	private Object console;
	private Object report;
	
	public Object_test(String name,int id,boolean repeat, int NumRepeat ){
		
		System.out.println("Constructing Object_test: " + name);
	       this.name = name;
	       this.id = id;
	       this.repeat=repeat;
	       this.NumRepeat=NumRepeat;
	         
	       
	       System.out.println("head:###########################################");
	       System.out.println("name:" + name);
	       System.out.println("id:" + id);
	       System.out.println("repeat:" + repeat);
	       System.out.println("NumRepeat:" + NumRepeat);
	       System.out.println("head:###########################################"); 
	       
	}

	public Object getConsole() {
		return console;
	}
	
	public Object getReport() {
		
		return report;
	}
	
	public String getName() {
		return name;
	}

	
	public int getId() {
		return id;
	}
	
	public boolean getRepeat() {
		return repeat;
	}
	
	public int getNumRepeat() {
		return NumRepeat;
	}

	public void setConsole(Object console) {
		this.console = console;
	}
}
