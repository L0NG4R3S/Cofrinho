package principal;

public class Euro extends Moeda {

	double euro = 6.20;
	
	public Euro(double valor) {
	    super(valor);
	}
	
	
	@Override
	public void info(){
	    System.out.println("Euro: " + euro);
	}
	
	@Override
	public double converter(double valor){
	    euro = euro * valor;
	    return euro;
	}
}
