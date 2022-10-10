package principal;

public class Real extends Moeda {

	double real = 6.2;
	
	public Real(double valor) {
	    super(valor);
	}
	
	@Override
	public void info(){
	    System.out.println("Real: " + real);
	}
	
	@Override
	public double converter(double valor){
	    real = real * valor;
	    return real;
	}
}
