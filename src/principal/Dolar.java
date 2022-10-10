package principal;

public class Dolar extends Moeda {
	
	double dolar = 5.19;
	
	public Dolar(double valor) {
	    super(valor);
	}
	
	@Override
	public void info(){
	    System.out.println("Dolar: " + dolar);
	}
	
	@Override
	public double converter(double valor){
	    dolar = dolar * valor;
	    return dolar;
	}
}
