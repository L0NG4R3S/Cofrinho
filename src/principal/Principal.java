package principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	    Scanner teclado = new Scanner(System.in);
	    Cofrinho cofre = new Cofrinho();
	    int opcao = 0;
	    int tipoMoeda;
	    double moeda;

	    do {
	    	
	    	System.out.println("\n### MENU, escolha uma opcao ###");
		    System.out.println("1-Adicionar Moeda");
		    System.out.println("2-Remover Moeda");
		    System.out.println("3-Listar Moedas");
		    System.out.println("4-Calcular total convertido para real");
		    System.out.println("5-Encerrar");
		    opcao = teclado.nextInt();

	        switch(opcao) {

	            case 1:
	                tipoMoeda=0;
	                while(tipoMoeda > 3 || tipoMoeda <= 0) {
	                    System.out.println("Escolha a moeda");
	                    System.out.println("1-Dolar");
	                    System.out.println("2-Euro");
	                    System.out.println("3-Real");
	                    tipoMoeda = teclado.nextInt();
	                }
	                System.out.println("Digite o valor?");
	                moeda = teclado.nextInt();
	                switch(tipoMoeda) {
	                	case 1:
	                		Dolar newDolar = new Dolar(moeda);
	                		cofre.adicionarMoeda(newDolar);
	                		break;
	                	case 2:
	                		Euro newEuro = new Euro(moeda);
	                		cofre.adicionarMoeda(newEuro);
	                		break;
	                	case 3:
	                		Real newReal = new Real(moeda);
	                		cofre.adicionarMoeda(newReal);
	                		break;
	                
	                }

	                break;

	            case 2:
	            	cofre.ListaParaRemoverMoeda();
	            	System.out.println("Digite o numero do item que deseja remover");
	            	int m = teclado.nextInt();
	            	cofre.removerMoeda(m);
	                break;

	            case 3:
	                System.out.println("Listar moedas adicionadas");
	                cofre.listagemMoeda();
	                break;

	            case 4:
	                System.out.println("Converter valores");
	                cofre.totalConvertido();
	                break;
	            default:
	                System.out.println("Opcao invalida!");
	        }

	    }while(opcao != 5);
	    
	    teclado.close();

	}
}
