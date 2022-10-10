package principal;

import java.util.ArrayList;

public class Cofrinho  {
	// ArrayList<Moeda> moedas;
	ArrayList<Moeda> moedas = new ArrayList<Moeda>();

    public void recebeMoedas(ArrayList<Moeda> moedas){
        this.moedas = moedas;
    }
    
    public void adicionarMoeda(Moeda moeda){
    	this.moedas.add(moeda);
    }
    
    public void ListaParaRemoverMoeda(){
    	for(int i=0; i<moedas.size(); i++) {
            System.out.println("Item numero: " + i);
            moedas.get(i).info();
            System.out.printf("valor: %2f \n\n", moedas.get(i).valor);
         }

    }

    public void removerMoeda(int moeda){
    	for(int i=0; i<moedas.size(); i++) {
    		Moeda m =  moedas.get(i);
           if(i == moeda) {
        	   moedas.remove(m);
           }
         }

    }

    public void listagemMoeda(){
    	for(Moeda m : moedas) {
           m.info();
           // System.out.printf("%2f", m.valor);
        }
    }

    public void totalConvertido(){
    	double total = 0;
    	for(Moeda m : moedas) {
           total = total + m.converter(m.valor);
         }
    	System.out.printf("TOTAL: %2f \n", total);
    }               
}
