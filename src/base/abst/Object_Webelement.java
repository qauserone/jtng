package base.abst;

public abstract class Object_Webelement {

	private String name;
	private int id;
	private boolean repeat;
	private int NumRepeat;
	private Object console;
	private Object report;

	private boolean Error;
	private int numError;
	
	public Object_Webelement(String name,int id,boolean repeat, int NumRepeat ){
		
		
		
		
		System.out.println("Constructing Object_Webelement: " + name);
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
	
	void msgError(boolean error) {
		if (error) {
			System.out.print("This is a error");
		}
	}
	
	
	public boolean isError() {
		return Error;
	}

	public void setError(boolean error) {
		Error = error;
	}

	public int getNumError() {
		return numError;
	}

	public void setNumError(int numError) {
		this.numError = numError;
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

	
	
	

